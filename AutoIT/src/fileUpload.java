import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class fileUpload {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = null;
		String downloadPath = System.getProperty("user.dir");
		String downloadedFileName = "converted.zip";
		File downloadedFile = new File(downloadPath + "/" + downloadedFileName);

		// Delete the file if it exists from a previous run to ensure a clean test
		if (downloadedFile.exists()) {
			downloadedFile.delete();
		}

		try {
			// Set the path to the ChromeDriver executable
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");

			// Configure Chrome options to set the download directory
			HashMap<String, Object> chromePrefs = new HashMap<>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadPath);

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);

			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set an implicit wait

			// Navigate to the website
			driver.get("https://altoconvertpdftojpg.com/");

			// Click the file chooser button
			driver.findElement(By.cssSelector("[class*='btn--choose']")).click();

			// Use AutoIt to handle the Windows file dialog
			// Note: Update the path to your AutoIt executable
			Runtime.getRuntime().exec("C:\\Users\\rahul\\Documents\\check\\fileupload.exe");

			// Wait for the "Convert Now" button to be visible and click it
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
			driver.findElement(By.cssSelector("button[class*='medium']")).click();

			// Wait for the "Download Now" link to be visible and click it
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));
			driver.findElement(By.linkText("Download Now")).click();

			// Wait until the file exists in the download directory
			wait.until(d -> downloadedFile.exists());

			// Assert that the file was successfully downloaded
			Assert.assertTrue(downloadedFile.exists(),
					"The converted.zip file was not found in the download directory.");
			System.out.println("File downloaded successfully!");

		} finally {
			// Ensure the WebDriver is closed, even if an exception occurs
			if (driver != null) {
				driver.quit();
				System.out.println("WebDriver closed.");
			}
		}
	}
}