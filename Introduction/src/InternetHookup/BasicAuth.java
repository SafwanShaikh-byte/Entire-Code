package InternetHookup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
        String password = "admin";
        String url = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";
        
        driver.get(url);
        
        String bodyText = driver.findElement(By.tagName("p")).getText();
        System.out.println("Page Text: " + bodyText);
		
		/*driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("a[href='/basic_auth']")).click();*/
		
		
	}

}