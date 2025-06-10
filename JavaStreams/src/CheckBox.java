import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		checkboxes.stream().filter(checkbox->!checkbox.isSelected()).forEach(WebElement::click);
		checkboxes.stream().filter(WebElement::isSelected).map(checkbox -> checkbox.getAttribute("value")).forEach(value -> System.out.println("Selected Checkbox Value: " + value));
		
		driver.close();
		}

}
