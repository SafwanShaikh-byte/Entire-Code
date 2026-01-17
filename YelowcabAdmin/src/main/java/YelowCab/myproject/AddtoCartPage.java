package YelowCab.myproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCartPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		
		driver.get("https://www.automationexercise.com/products");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("John.m@yopmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@data-qa='login-button']")).click();*/
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_product"))).sendKeys("Blue Top");
		driver.findElement(By.id("submit_search")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='View Product']")).click();
		
		WebElement quantity = driver.findElement(By.id("quantity"));
		quantity.clear();
		quantity.sendKeys("3");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
		
		
	}

}