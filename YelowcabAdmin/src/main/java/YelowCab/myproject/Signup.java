package YelowCab.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("John");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("John.m@yopmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("12345678");
		
		WebElement days = driver.findElement(By.id("days"));
		days.sendKeys("21");
		days.sendKeys(Keys.ARROW_DOWN);
		days.sendKeys(Keys.ENTER);
		
		WebElement month = driver.findElement(By.id("months"));
		month.sendKeys("August");
		month.sendKeys(Keys.ENTER);
		
		WebElement year = driver.findElement(By.id("years"));
		year.sendKeys("1992");
		year.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		
		
		driver.findElement(By.xpath("//input[@data-qa='first_name']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@data-qa='last_name']")).sendKeys("Mathew");
		driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("House Number 45");
		driver.findElement(By.xpath("//input[@data-qa='address2']")).sendKeys("Ahmedabad");
		WebElement country = driver.findElement(By.id("country"));
		country.sendKeys("India");
		country.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Gujarat");
		driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("Ahmedabad");
		driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("380001");
		driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys("7567075670");
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		
		System.out.println("Account Created");
		driver.switchTo().alert().accept();
		

	}

}
