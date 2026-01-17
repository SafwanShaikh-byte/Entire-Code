package YelowCab.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver",
				"D:\\\\Browser Drivers\\\\Chrome Drivers\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// Radio Button
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.xpath("//input[@value='radio3']")).click();

		// Suggetion Class Example

		WebElement suggestion = driver.findElement(By.id("autocomplete"));
		suggestion.sendKeys("India");

		Thread.sleep(2000);
		suggestion.sendKeys(Keys.ARROW_DOWN);
		suggestion.sendKeys(Keys.ENTER);

		// Dropdown Example

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		
		dropdown.sendKeys("Option2");
		// Thread.sleep(2000);
		//dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ENTER);
		
		System.out.println("Selected Option from Dropdown: " + dropdown.getAttribute("value"));
		
		

		// Checkbox Example
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("checkBoxOption3")).click();

		// Switch Window Example

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.id("openwindow")).click();
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		System.out.println("Child Window Title: " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);

		System.out.println("Parent Window Title: " + driver.getTitle());

		driver.quit();

	}

}