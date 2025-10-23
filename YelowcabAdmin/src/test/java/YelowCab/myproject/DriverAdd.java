package YelowCab.myproject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverAdd {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yelowcab.yelowsoft.co/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id='inputEmail']")).sendKeys("support+12@yelowsoft.com");
		driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("pbdev@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB).get(" https://yelowcab.yelowsoft.co/driver");

		driver.findElement(By.xpath("//a[@class='btn btn-accent']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Please Enter First Name']")).sendKeys("sagar");

		driver.findElement(By.xpath("//input[@placeholder='Please Enter Last Name']")).sendKeys("khandekar");

		driver.findElement(By.xpath("//input[@placeholder='Please enter phone number']")).sendKeys("778801547");

		WebElement gender = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		gender.sendKeys(Keys.DOWN, Keys.ENTER);

		driver.findElement(By.xpath("(//button[normalize-space()='Save & Next'])[1]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("(//span[normalize-space()='Add Vehicle'])[1]")).click();

		driver.findElement(By.xpath("(//input[@placeholder='Enter Number Plate'])[1]")).sendKeys("099888");

		WebElement noplate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		noplate.sendKeys(Keys.DOWN, Keys.ENTER);
		WebElement model = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		Thread.sleep(2000);
		model.sendKeys(Keys.DOWN, Keys.ENTER);
		driver.findElement(By.xpath("(//input[@placeholder='Please Enter Manufacturered Year'])[1]")).sendKeys("2024");
		driver.findElement(By.xpath("(//input[@placeholder='Please Enter Vehicle Color'])[1]")).sendKeys("Black");
		driver.findElement(By.xpath("(//input[@placeholder='Please Enter Taxi No'])[1]")).sendKeys("6767");
		driver.findElement(By.xpath("(//button[normalize-space()='Save & Next'])[1]")).click();
		Thread.sleep(4000);
		WebElement vehicletype = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		vehicletype.sendKeys(Keys.DOWN, Keys.ENTER);
		WebElement subscriptiontype = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		Thread.sleep(3000);
		subscriptiontype.sendKeys(Keys.DOWN, Keys.ENTER);
		WebElement subscriptionplan = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		Thread.sleep(3000);
		subscriptionplan.sendKeys(Keys.DOWN, Keys.ENTER);
		driver.findElement(By.xpath("(//button[normalize-space()='Save & Next'])[1]")).click();
		Thread.sleep(4000);
		WebElement scheduletype = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Thread.sleep(3000);
		scheduletype.sendKeys(Keys.DOWN, Keys.ENTER);
		WebElement monthlytype = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Thread.sleep(3000);
		monthlytype.sendKeys(Keys.DOWN, Keys.ENTER);
		// Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='Update Save & Next'])[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Submit'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[normalize-space()='Activate'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Activate It']")).click();
	}
}