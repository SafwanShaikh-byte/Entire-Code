package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Upload {

	public static void main(String[] args) throws IOException {
		String fruitName = "Apple";
		String updatedValue = "710";
		String fileName = "C:/Users/Safwan/Downloads/download.xlsx";

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");

		// Download
		driver.findElement(By.cssSelector("#downloadButton")).click();

		// ✅ Wait for file to exist (optional safety net)
		waitForFileDownload(fileName, 10);

		// Edit Excel
		int col = getColumnNumber(fileName, "Price");
		int row = getRowNumber(fileName, fruitName);
		Assert.assertTrue(updateCell(fileName, row, col, updatedValue));

		// Upload updated file
		WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));
		upload.sendKeys(fileName);

		// Wait for toast success
		By toastLocator = By.cssSelector(".Toastify__toast-body div:nth-child(2)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
		String toastText = driver.findElement(toastLocator).getText();
		System.out.println("Toast: " + toastText);
		Assert.assertEquals(toastText, "Updated Excel Data Successfully.");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));

		// Verify in web table
		String priceColumn = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		String actualPrice = driver.findElement(By.xpath("//div[text()='" + fruitName
				+ "']/parent::div/parent::div/div[@id='cell-" + priceColumn + "-undefined']")).getText();
		System.out.println("Web Price: " + actualPrice);
		Assert.assertEquals(actualPrice, updatedValue);

		driver.quit();
	}

	private static boolean updateCell(String fileName, int row, int col, String updatedValue) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		Row rowField = sheet.getRow(row);
		if (rowField == null)
			rowField = sheet.createRow(row);

		Cell cellField = rowField.getCell(col);
		if (cellField == null)
			cellField = rowField.createCell(col);

		cellField.setCellValue(updatedValue);

		fis.close();
		FileOutputStream fos = new FileOutputStream(fileName);
		workbook.write(fos);
		workbook.close();
		fos.close();
		return true;
	}

	private static int getRowNumber(String fileName, String text) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int index = 0;
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell.getCellType() == CellType.STRING && cell.getStringCellValue().equalsIgnoreCase(text)) {
					workbook.close();
					fis.close();
					return index;
				}
			}
			index++;
		}

		workbook.close();
		fis.close();
		throw new IllegalArgumentException("Row with value '" + text + "' not found.");
	}

	private static int getColumnNumber(String fileName, String colName) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		Row firstRow = sheet.getRow(0);
		int index = 0;
		for (Cell cell : firstRow) {
			if (cell.getCellType() == CellType.STRING && cell.getStringCellValue().equalsIgnoreCase(colName)) {
				workbook.close();
				fis.close();
				return index;
			}
			index++;
		}

		workbook.close();
		fis.close();
		throw new IllegalArgumentException("Column '" + colName + "' not found.");
	}

	private static void waitForFileDownload(String filePath, int timeoutSeconds) {
		File file = new File(filePath);
		int waited = 0;
		while (!file.exists() && waited < timeoutSeconds * 1000) {
			try {
				Thread.sleep(500);
				waited += 500;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (!file.exists()) {
			throw new RuntimeException("File not downloaded: " + filePath);
		}
	}
}
