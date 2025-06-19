package dataDriven.excelDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvide {

	DataFormatter formatter = new DataFormatter();

	@Test(dataProvider = "driverTest")
	public void testCaseData(String Greetings, String Communication, String id) {
		System.out.println(Greetings +"" +Communication + "" + id);

	}
	// Multiple sets of data to our test
	// arraypublic
	// 5 Sets of data

	@DataProvider(name = "driverTest")
	public Object[][] getData() throws IOException {
		// To test from the Code only we have declared Multidimensional array
		// Object[][] data =
		// {{"Hello","text",1},{"bye","message",143},{"Solo","Call",453}};

		// To Read the data from Excel File
		FileInputStream fis = new FileInputStream("C:\\Users\\Safwan\\Downloads\\TestNG.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Number of Sheet : " + rowcount);

		XSSFRow row = sheet.getRow(0);
		int colcount = row.getLastCellNum();
		System.out.println("Total Number of Column : " + colcount);

		Object data[][] = new Object[rowcount - 1][colcount];

		for (int i = 0; i < rowcount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
			}
		}
		 return data;
	}

}
