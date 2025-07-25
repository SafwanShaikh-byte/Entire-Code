import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	private WebDriver driver; // 1. Declared as a class member

	// This constructor could be empty or do initial setup, but
	// for a simple demo, we'll put the logic in a main method or dedicated setup.
	// public Demo() {
	// // ...
	// }

	// Dedicated method for setup
	public void setupBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		// Create a Map to hold all desired Chrome preferences
		Map<String, Object> prefs = new HashMap<>();

		// 1. Disable the "Offer to save passwords" prompt
		prefs.put("credentials_enable_service", false);
		// 2. Disable the overall password manager functionality
		prefs.put("profile.password_manager_enabled", false);
		// 3. Crucially, disable password leak detection, which causes the "Change your
		// password" pop-up
		prefs.put("profile.password_manager_leak_detection", false);
		
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-save-password-bubble");

		driver = new ChromeDriver(options); // Initialize the class-level driver
		driver.manage().window().maximize();
		System.out.println("Browser setup complete and maximized.");
	}

	// Dedicated method to navigate
	public void navigateToSauceDemo() {
		driver.get("https://www.saucedemo.com/");
		System.out.println("Navigated to Sauce Demo.");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

	public void addtocart() {
		if (driver != null) {
			// Add an explicit wait here to ensure the button is clickable after page load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#add-to-cart-sauce-labs-backpack")))
					.click();
			System.out.println("Clicked 'Add to Cart' for Sauce Labs Backpack.");
		} else {
			System.err.println("WebDriver not initialized. Cannot add to cart.");
		}
	}

	// Dedicated method for teardown
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
			System.out.println("Browser closed.");
		}
	}

	public void cartButton() {
		driver.findElement(By.cssSelector(".shopping_cart_badge")).click();
	}

	public void checkoutPage() {
		WebElement lists = driver.findElement(By.cssSelector(".cart_list"));
		lists.getText();
		driver.findElement(By.id("checkout")).click();
		;

	}

	public void userInfo()

	{
		driver.findElement(By.id("first-name")).sendKeys("Safwan");
		driver.findElement(By.id("last-name")).sendKeys("Shaikh");
		driver.findElement(By.id("postal-code")).sendKeys("380051");
		driver.findElement(By.id("continue")).click();
		;

	}

	public void Overviewpage() {

		driver.findElement(By.className("summary_subtotal_label")).getText();
		driver.findElement(By.className("summary_total_label")).getText();
		driver.findElement(By.id("finish")).click();
	}
	
	public void Successmessage() 
	{
		WebElement success = driver.findElement(By.className ("complete-header"));
		String message = success.getText();
		System.out.println("Displaying Messgae:" + message );
	}
	
	public void logOut() throws InterruptedException 
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000L);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}

	// 2. The main method is the entry point of the program
	public static void main(String[] args) throws InterruptedException {
		Demo demo = new Demo(); // Create an instance of your Demo class

		demo.setupBrowser();
		Thread.sleep(5000);// Call the setup method
		demo.navigateToSauceDemo();
		demo.addtocart();
		demo.cartButton();
		demo.checkoutPage();
		Thread.sleep(1000L);
		demo.userInfo();
		demo.Overviewpage();
		demo.Successmessage();
		demo.logOut();
		Thread.sleep(5000); // Keep browser open for 5 seconds
		// 3. Ensure the browser is closed even if an error occurs
		demo.closeBrowser();

	}
}