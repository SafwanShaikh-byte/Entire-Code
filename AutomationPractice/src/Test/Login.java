package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

	// TODO Auto-generated method stub

	ChromeOptions options = new ChromeOptions();
	WebDriver driver;

	@BeforeMethod
	public void wakeupbrowser() 
	{
		System.setProperty("WebDriver.Chrome.options",
				"D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser opened");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void placeholder() 
	{
		driver.get("https://www.saucedemo.com/");
		WebElement Userfield = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String Userplaceholder = Userfield.getAttribute("Placeholder");		
		System.out.println("Placeholder in User field : " + Userplaceholder);
		
	}
	
	@Test
	public void Scenario1()

	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_use");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		String error = driver.findElement(By.tagName("h3")).getText();
		System.out.println("Getting Error : " +error);
	}

	@Test (dependsOnMethods = {"Scenario1"})
	public void Scenario2()

	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		String error = driver.findElement(By.tagName("h3")).getText();
		System.out.println("Getting Error : " +error);
	}
	
	@Test
	public void SuccessLogin()

	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		String pagetitle = driver.getTitle();
		System.out.println("Logged in Successfully");
		System.out.println("Page Name : " + pagetitle);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void links() 
	{
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkcount = links.size();
		System.out.println("Available Links on Page : " + linkcount);
		
		System.out.println("List of all links on the webpage :");
		
		for (WebElement link:links) 
		{
			String linkText  = link.getText();
			String linkHref = link.getAttribute("href");
			
			System.out.println("Link Text : " + linkText + " - URL : " + linkHref);
		}
	}
	
	@Test
	public void Headerlogo() 
	{
		driver.get("https://ultimateqa.com/automation");
		WebElement headerLabel = driver.findElement(By.xpath("//span[contains(text(),'Use your skills to learn how to automate different')]"));
		String text = headerLabel.getText();
		System.out.println("Header Lable is :" + text);
		
	}
	
	@Test
	public void Hamburgerbutton () 
	{
		WebElement button = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		button.click();
	}
	
	@Test
	public void AddProduct() 
	{
		driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
		
	}
	
	@AfterMethod
	public void closebrowser() 
	{
		driver.quit();
		System.out.println("Browser Closed");
	}
	
}
