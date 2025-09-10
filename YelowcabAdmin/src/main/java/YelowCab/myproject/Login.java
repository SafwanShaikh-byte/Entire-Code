package YelowCab.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		ChromeOptions options = new ChromeOptions();
        options.addArguments("--use-fake-ui-for-media-stream", "--disable-geolocation", "--disable-notifications");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://yelowcab.yelowsoft.co/login");
		driver.findElement(By.xpath("//input[@name='inputEmail']")).sendKeys("support+12@yelowsoft.com");
		driver.findElement(By.id("inputPassword")).sendKeys("pbdev@123");
		Thread.sleep(3000L);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
