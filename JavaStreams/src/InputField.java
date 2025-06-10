import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputField {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		@SuppressWarnings("deprecation")
		List<String> inputNames = driver.findElements(By.tagName("input")).stream().map(input -> input.getAttribute("name")).collect(Collectors.toList());

        inputNames.forEach(System.out::println);

        driver.quit();
	}

}
