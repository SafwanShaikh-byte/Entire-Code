package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchBox = By.id("search_product");
	By searchBtn = By.id("submit_search");
	By viewProduct = By.xpath("//a[text()='View Product']");
	By quantity = By.id("quantity");
	By addToCart = By.xpath("//button[@type='button']");
	By viewCart = By.xpath("//u[text()='View Cart']");

	public void searchProduct(String product) {
		driver.findElement(searchBox).sendKeys(product);
		driver.findElement(searchBtn).click();
	}

	public void addProductToCart() {
		driver.findElement(viewProduct).click();
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys("3");
		driver.findElement(addToCart).click();
		driver.findElement(viewCart).click();
	}
}
