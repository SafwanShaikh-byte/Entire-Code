import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindClickaButtonwithSpecificText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String mainWindowHandle = driver.getWindowHandle();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> buttons = driver.findElements(By.id("openwindow"));
		
		buttons.stream().filter(btn -> btn.getText().equalsIgnoreCase("Open Window")).findFirst().ifPresent(WebElement :: click);
		System.out.println("Succesfully Clicked on Open Window Button");
		
		driver.switchTo().window(mainWindowHandle);
		System.out.println("Back to the Parent Screen");
		driver.quit();
	}

}
