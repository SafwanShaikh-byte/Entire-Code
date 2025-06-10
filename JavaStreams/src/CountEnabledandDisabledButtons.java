import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountEnabledandDisabledButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();        
        WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		
		long enbledcount = buttons.stream().filter(WebElement::isEnabled).count();
		long disablecount = buttons.stream().filter(btn-> !btn.isEnabled()).count();
		
		System.out.println("Enabled Buttons: " + enbledcount);
        System.out.println("Disabled Buttons: " + disablecount);
        
        driver.quit();

	}

}
