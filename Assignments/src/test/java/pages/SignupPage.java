package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

	WebDriver driver;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	By name = By.name("name");
	By email = By.xpath("//input[@data-qa='signup-email']");
	By signupBtn = By.xpath("//button[text()='Signup']");

	public void newUserSignup(String userName, String userEmail) {
		driver.findElement(name).sendKeys(userName);
		driver.findElement(email).sendKeys(userEmail);
		driver.findElement(signupBtn).click();
	}
}
