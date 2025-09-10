package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications", "--disable-geolocation");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get("https://yelowcab.yelowsoft.co/login");
		WebElement usernameField = driver.findElement(By.xpath("//*[@name='inputEmail']"));
		usernameField.sendKeys("support+12@yelowsoft.com");
		WebElement passwordField = driver.findElement(By.xpath("//*[@name='inputPassword']"));
		passwordField.sendKeys("pbdev@123");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//*[text()=' Sign In ']")).click();

		driver.switchTo().newWindow(WindowType.TAB).get("https://yelowcab.yelowsoft.co/yelowcab/ride/new-add");
		Thread.sleep(2000);
		WebElement dateField = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-calendar']")));
		dateField.clear();
		dateField.sendKeys("09/09/2025");
		WebElement tripTypeDropdown = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='ng-option ng-option-selected ng-option-marked']")));
		Select tripTypeSelect = new Select(tripTypeDropdown);
		tripTypeSelect.selectByVisibleText("Point to Point");
		WebElement pickupLocationField = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@type='text'])[15]")));
		pickupLocationField.sendKeys("Ahmedabad");
		WebElement destinationLocationField = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@type='text'])[15]")));
		destinationLocationField.sendKeys("Sarkhej");
		WebElement passengersDropdown = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//Select[@class='ng-option ng-option-selected ng-option-marked']")));
		Select passengersSelect = new Select(passengersDropdown);
		passengersSelect.selectByValue("1");
		WebElement luggageDropdown = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//Select[@class='ng-option ng-option-selected ng-option-marked']")));
		Select luggageSelect = new Select(luggageDropdown);
		luggageSelect.selectByValue("1");
		WebElement vehicleTypeDropdown = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//Select[@class='heading font-weight-600 mb-1'])[5]")));
		Select vehicleSelect = new Select(vehicleTypeDropdown);
		vehicleSelect.selectByVisibleText("Sedan");
		// driver.quit();
	}
}
