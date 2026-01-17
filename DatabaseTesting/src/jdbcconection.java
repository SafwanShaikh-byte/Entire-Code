import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jdbcconection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Browser Drivers\\Chrome Drivers\\chromedriver-win32\\chromedriver.exe");

		String host = "localhost";

		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "Shaikh@7135");

		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from Employeeinfo where name = 'Safwan'");

		//For Local Server
		
		/*while (rs.next())
			
		{
			
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("id"));
		}*/
		
		
		//For Sales Force Website
		while (rs.next())

		{

			WebDriver driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			
			driver.get("https://login.salesforce.com/");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys(rs.getString("name"));
			driver.findElement(By.id("password")).sendKeys(rs.getString("id"));
			
			driver.quit();

		}
		
		
	}

	

}