import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AllFieldSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();        
        WebDriver driver = new ChromeDriver();
        
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> fieldSet = driver.findElements(By.tagName("fieldset"));
		
		List<String> options = fieldSet.stream().map(WebElement::getText).collect(Collectors.toList());
		options.forEach(System.out::println);

	}

}
