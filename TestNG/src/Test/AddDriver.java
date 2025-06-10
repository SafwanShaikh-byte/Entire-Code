package Test;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class AddDriver {

	ChromeOptions options = new ChromeOptions();
	WebDriver driver;

	@BeforeClass
	public void Wakeupboowser()

	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser opened");
	}

	@BeforeMethod
	public void Login() throws InterruptedException

	{
		driver.get("https://developer.yelowsoft.co/login");
		driver.findElement(By.id("inputEmail")).sendKeys("support+12345@yelowsoft.com");
		driver.findElement(By.id("inputPassword")).sendKeys("pbdev@123");
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Logged in into the 663");

	}

	@Test
	public void driveradd() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open();");

		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(handles);

		driver.switchTo().window(tabs.get(1));
		driver.get("https://developer.yelowsoft.co/driver?page=1&is_active=1");

		WebElement addbutton = driver.findElement(By.xpath("//a[normalize-space()='Add']"));
		addbutton.click();
	}

	/*
	 * @AfterClass public void close()
	 * 
	 * { driver.quit(); System.out.println("Browser Closed"); }
	 */

}
