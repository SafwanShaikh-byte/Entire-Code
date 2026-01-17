package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	WebDriver driver;

	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}

	By password = By.id("password");
	By days = By.id("days");
	By months = By.id("months");
	By years = By.id("years");
	By createAccountBtn = By.xpath("//button[text()='Create Account']");
	By continueBtn = By.xpath("//a[text()='Continue']");

	public void fillAccountDetails() {
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(password).sendKeys("Test@123");
		driver.findElement(days).sendKeys("10");
		driver.findElement(months).sendKeys("May");
		driver.findElement(years).sendKeys("1995");
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

		driver.findElement(createAccountBtn).click();
		driver.findElement(continueBtn).click();
	}
}
