package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleDemo {

	// WebDriver instance
	WebDriver driver;

	// Before Method - Runs before each test method
	@BeforeMethod
	public void setUp() {
		// Set the path to the ChromeDriver executable (make sure it's installed and
		// path is correct)
		System.setProperty("webdriver.chrome.driver",
				"D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser opened");
	}

	// After Method - Runs after each test method
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Browser closed");
	}

	// Before Class - Runs once before any test method in the class
	@BeforeClass
	public void beforeClass() {
		System.out.println("Test class setup");
	}

	// After Class - Runs once after all test methods in the class
	@AfterClass
	public void afterClass() {
		System.out.println("Test class teardown");
	}

	// Test method
	@Test
	public void testGoogleSearch() {
		// Step 1: Open Google
		driver.get("https://www.google.com");

		// Step 2: Locate search bar and enter text
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium WebDriver");

		// Step 3: Submit the search form
		searchBox.submit();

		// Step 4: Wait for results to load (a simple sleep in this case, could be
		// replaced with WebDriverWait)
		try {
			Thread.sleep(2000); // 2 seconds delay for simplicity
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Step 5: Verify the title of the page contains "Selenium WebDriver"
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: " + pageTitle);
		assert pageTitle.contains("Selenium WebDriver");

		// If the assertion passes, the test will be marked as passed
	}
}
