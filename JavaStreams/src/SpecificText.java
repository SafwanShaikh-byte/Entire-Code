import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("body"));
		
		Boolean containsText = links.stream().map(WebElement::getText).anyMatch(text->text.contains("Element"));
		
		String bodyText = links.stream().map(WebElement::getText).collect(Collectors.joining(" "));
		
		System.out.println("Page contains 'Element' text: " + containsText);
		System.out.println("Page contains Total text: " + bodyText);
		
		long wordcount = countwords(bodyText);
		
		System.out.println("Total Words count :" +wordcount);
	}

	public static long countwords(String text) 
	{
		
		String[] words = text.split("\\s+");
		return words.length;
	}

}