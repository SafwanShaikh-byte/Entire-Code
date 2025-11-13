package RahulShetty;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Radio Button
		driver.findElement(By.name("radioButton")).click();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		
		System.out.println("All Raio Button Selected");
		
		//Suggestion Class Example
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("autocomplete"))));
		search.sendKeys("Bangladesh");
		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item div"));		
		
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("Bangladesh")) 
			{
				option.click();
				break;
			}
		}
		System.out.println("All Suggestion Selected");
		System.out.println("Selected Suggestion class : " + search.getAttribute("value"));
		
		//Dropdown Example
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		List<WebElement> ddoptions = driver.findElements(By.cssSelector("#dropdown-class-example option"));
		ddoptions.get(2).click();
		System.out.println("All Dropdown Selected");
		System.out.println("Selected Dropdown option : " + ddoptions.get(2).getText());
		
		//Checkbox Example
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		checkboxes.get(0).click();
		checkboxes.get(1).click();
		checkboxes.get(2).click();
		System.out.println("All Checkbox Selected");
		
		//Swtich Window Example
		driver.findElement(By.id("openwindow")).click();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		System.out.println("New Window Title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		
		//Switch Tab Example
		
		driver.findElement(By.id("opentab")).click();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		System.out.println("New Tab Title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		
		
		//Alert Example
		
		driver.findElement(By.id("name")).sendKeys("Rahul");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println("Alert Message : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("name")).sendKeys("Rahul");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println("Confirm Alert Message : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		//Web Table Example
		
		WebElement table = driver.findElement(By.id("product"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(WebElement row : rows) 
		{
			List<WebElement> cols = row.findElements(By.tagName("td"));
			
			for (WebElement col : cols) 
			{
				System.out.print(col.getText() + " | ");
			}
			System.out.println();
		
		}
		
		//Element Displayed Example
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text Box Displayed : " + textBox.isDisplayed());
		driver.findElement(By.id("hide-textbox")).click();
		System.out.println("Text Box Displayed after hide : " + textBox.isDisplayed());
		driver.findElement(By.id("show-textbox")).click();
		System.out.println("Text Box Displayed after show : " + textBox.isDisplayed());
		
		//Web Table Fixed header
		WebElement scrollTable = driver.findElement(By.cssSelector(".tableFixHead"));
		
		List<WebElement> scrollRows = scrollTable.findElements(By.tagName("tr"));
		
		int sum = 0;
		
		for(WebElement row : scrollRows) 
		{
			List<WebElement> cols = row.findElements(By.tagName("td"));
			
			if(cols.size()>0)
			{
				System.out.println("Amount : " + cols.get(3).getText());
			
			
			sum = sum + Integer.parseInt(cols.get(3).getText());
			}
		}
		System.out.println("Sum of Amounts : " + sum);
		
		
		System.out.println("List of Cities from Scrollable Table : ");
		List<WebElement> cities = scrollTable.findElements(By.cssSelector("tbody tr td:nth-child(3)"));
		
		for(WebElement city : cities) 
		{
			System.out.println(city.getText());
		}
		System.out.println();
		
		//Mouse Hover Example
		
		WebElement hoverButton = driver.findElement(By.id("mousehover"));
		hoverButton.click();
		WebElement topOption = driver.findElement(By.cssSelector(".mouse-hover-content a:nth-child(1)"));
		topOption.click();
		System.out.println("Clicked on Top Option from Mouse Hover");
		WebElement reloadButton = driver.findElement(By.id("mousehover"));
		reloadButton.click();
		System.out.println("Clicked on Reload Option from Mouse Hover");
		
		//iframe Example
		driver.switchTo().frame("courses-iframe");
		System.out.println("Iframe Title : " + driver.getTitle());
		driver.switchTo().defaultContent();
		
		//Broken Link Example
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links in Page : " + links.size());
		
		for(WebElement link : links) 
		{
			String url = link.getAttribute("href");
			System.out.println("Link URL : " + url);
			//Here you can add code to verify if the link is broken or not using HttpURLConnection
			//Broken link verification
			
			 if (url == null || url.isEmpty()) 
			 {
	                System.out.println("⚠️ Skipping empty or null link");
	                continue;
	         }
			 	         try {
	             java.net.HttpURLConnection connection = (java.net.HttpURLConnection) (new java.net.URL(url).openConnection());
	             connection.setRequestMethod("HEAD");
	             connection.connect();
	             int responseCode = connection.getResponseCode();
	             if (responseCode >= 400) {
	                 System.out.println("❌ Broken Link: " + url + " - Response Code: " + responseCode);
	             } else {
	                 System.out.println("✅ Valid Link: " + url + " - Response Code: " + responseCode);
	             }
	         } catch (Exception e) {
	             System.out.println("⚠️ Exception while checking link: " + url + " - " + e.getMessage());
	             System.out.println();
	             System.out.println("Total Broken Links Checked" + links.size());
	         }
			
		}
		
		
		//Closing the driver
		driver.quit();
		
	}

}
