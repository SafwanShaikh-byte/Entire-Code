package YelowCab.myproject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SauceDemo {

	public static void main(String[] args) {

		// Chrome options to disable password popup
		ChromeOptions options = new ChromeOptions();

		// Add Arguments to disable various UI features
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
		options.addArguments("--start-maximized"); // Cleaner than driver.manage().window().maximize()

		// Comprehensive Preference Map
		Map<String, Object> prefs = new HashMap<>();
		// Disable the "Save Password" prompt
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		
		// Disable the "Autofill" feature which often triggers the same behavior
		prefs.put("autofill.profile_enabled", false);
		prefs.put("autofill.address_enabled", false);

		// Invoke the Browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		// Navigate to the Web Page
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		// Enter the Credentials
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		// Collecting all Products

		List<WebElement> items = driver.findElements(By.className("inventory_item"));
		System.out.println("Total Products: " + items.size());

		// Adding Product to the Cart
		String productToAdd = "Sauce Labs Backpack";

		for (WebElement products : items) {
			String productName = products.findElement(By.className("inventory_item_name")).getText();
			System.out.println(productName);

			if (productName.equalsIgnoreCase(productToAdd)) {
				products.findElement(By.tagName("button")).click();
				System.out.println(productName + " added to cart");
				break;
			}

		}

		// Clicking on Cart Button

		driver.findElement(By.className("shopping_cart_badge")).click();
		System.out.println("Clicked on My Cart Button");

		// Cart Page
		driver.findElement(By.id("checkout")).click();
		System.out.println("Proceed for the Checkout");

		// Checkout Information
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Safwan");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Shaikh");
		driver.findElement(By.cssSelector("input[placeholder='Zip/Postal Code']")).sendKeys("380051");
		driver.findElement(By.id("continue")).click();
		System.out.println("Proceed for the Checkout");

		// Checkout Overview
		List<WebElement> cartItems = driver.findElements(By.className("cart_item"));

		System.out.println("--- Summary of Selected Products ---");

		for (WebElement item : cartItems) {
			// Capturing specific details using relative XPaths
			String name = item.findElement(By.className("inventory_item_name")).getText();
			String price = item.findElement(By.className("inventory_item_price")).getText();
			String qty = item.findElement(By.className("cart_quantity")).getText();

			System.out.println("Product: " + name);
			System.out.println("Quantity: " + qty);
			System.out.println("Price: " + price);
			System.out.println("------------------------------------");
		}

		driver.findElement(By.id("finish")).click();

		// driver.quit();
	}

}