package InternetHookup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABTesting {

	public static void main(String[] args) {
		// Set the path to ChromeDriver executable
		System.setProperty("webdriver.chrome.driver",
				"D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win32\\chromedriver.exe");

		// Initialize WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open the website
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/abtest']")).click();
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Close the browser after the task is complete
		driver.quit();
	}
}
