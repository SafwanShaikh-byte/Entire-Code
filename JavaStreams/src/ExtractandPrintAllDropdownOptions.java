import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExtractandPrintAllDropdownOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.tagName("select"));
		Select dropdown1 = new Select(dropdown);
		
		List<String> options = dropdown1.getOptions().stream().map(WebElement::getText).collect(Collectors.toList());
		options.forEach(System.out::println);

		
	}

}
