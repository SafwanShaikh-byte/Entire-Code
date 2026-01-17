package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By signupLoginBtn = By.xpath("//a[text()=' Signup / Login']");
	By productsBtn = By.xpath("//a[text()=' Products']");
	
	public void clickSignupLogin() {
		driver.findElement(signupLoginBtn).click();
	}

	public void clickProducts() {
		driver.findElement(productsBtn).click();
	}

}
