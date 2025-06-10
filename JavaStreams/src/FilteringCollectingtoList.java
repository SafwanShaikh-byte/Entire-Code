import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilteringCollectingtoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		List<String> links = driver.findElements(By.tagName("a")).stream().map(WebElement::getText)
				.filter(text -> !text.isEmpty()).collect(Collectors.toList());

		links.forEach(System.out::println);
		System.out.println("Number of Links Availble on Page : " +links.size());
		driver.quit();

	}

}
