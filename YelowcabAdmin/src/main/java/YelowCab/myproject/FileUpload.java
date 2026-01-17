package YelowCab.myproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver", "D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/upload");
		
		driver.manage().window().maximize();
		WebElement emailField = driver.findElement(By.xpath("//input[@id='fileInput']"));
		emailField.sendKeys("C:\\Users\\Safwan\\Downloads\\bread.jfif");
		System.out.println("File Selected Successfully");
		
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='fileSubmit']")));
		
		JavascriptExecutor  js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        js.executeScript("arguments[0].click();", submitButton);
		
		System.out.println("File Uploaded Successfully");
		

	}

}
