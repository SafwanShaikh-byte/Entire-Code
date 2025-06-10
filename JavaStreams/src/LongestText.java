import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LongestText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		 List<WebElement> elements = driver.findElements(By.tagName("body"));
		 Optional<WebElement> longestTextElement = elements.stream().max((e1, e2) -> Integer.compare(e1.getText().length(), e2.getText().length()));

	      longestTextElement.ifPresent(element -> System.out.println("Longest Text: " + element.getText()));

	     driver.quit();
		
	}

}
