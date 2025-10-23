package InternetHookup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\Browser Drivers\\\\Chrome Drivers\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Add/Remove Elements']")).click();
		driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
		driver.findElement(By.cssSelector(".added-manually")).click();
		driver.quit();
		;
	}

}
