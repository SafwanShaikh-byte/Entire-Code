package Test;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddbookingBulk {

    public static void main(String[] args) throws InterruptedException {
        // Initialize Chrome Options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--use-fake-ui-for-media-stream"); // Allow media access
        options.addArguments("--disable-geolocation");
        options.addArguments("--disable-notifications");

        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        
        // Login
        driver.get("https://developer.yelowsoft.co/login");
        driver.findElement(By.id("inputEmail")).sendKeys("support+12345@yelowsoft.com");
        driver.findElement(By.id("inputPassword")).sendKeys("pbdev@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        // Wait for login
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://developer.yelowsoft.co/"));
        
        // Open new tab for booking
        WebDriver newWindow = driver.switchTo().newWindow(WindowType.TAB);
        newWindow.get("https://developer.yelowsoft.co/taxi/ride/add/booking");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));

        // Create 500 bookings
        for (int i = 0; i < 500; i++) {
            try {
                createBooking(driver, wait, i);
                System.out.println("Booking " + (i + 1) + " created successfully!");
                Thread.sleep(2000L); // Wait between bookings to prevent server overload
            } catch (Exception e) {
                System.err.println("Error creating booking " + (i + 1) + ": " + e.getMessage());
            }
        }

        // Close the driver after all bookings
        driver.quit();
    }

    @SuppressWarnings("deprecation")
	private static void createBooking(WebDriver driver, WebDriverWait wait, int tripIndex) throws InterruptedException {
        // For Pick up Location
        WebElement pickup = driver.findElement(By.xpath("//input[@type='text'] [1]"));
        pickup.sendKeys("Location " + (tripIndex + 1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='combobox']")));
        pickup.sendKeys(Keys.DOWN);
        pickup.sendKeys(Keys.ENTER);
        String pickupLocation = driver.findElement(By.xpath("//span[@title]")).getAttribute("title");
        System.out.println("Selected Pick Up Location: " + pickupLocation);

        // For Drop Off Location
        WebElement dropOff = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        dropOff.sendKeys("DropOff " + (tripIndex + 1));
        Thread.sleep(2000L);
        dropOff.sendKeys(Keys.DOWN);
        dropOff.sendKeys(Keys.ENTER);
        String dropOffLocation = driver.findElement(By.xpath("//span[@title]")).getText();
        System.out.println("Selected Drop off Location: " + dropOffLocation);

        // To Select Passenger Count
        WebElement passenger = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        passenger.click();
        passenger.sendKeys(Keys.DOWN);
        passenger.sendKeys(Keys.ENTER);
        String passengerCount = driver.findElement(By.xpath("//div[contains(@class, 'ng-select')]")).getText();
        System.out.println("Selected Passengers: " + passengerCount);

        // To Select Luggage Count
        WebElement luggage = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        luggage.click();
        luggage.sendKeys(Keys.DOWN);
        luggage.sendKeys(Keys.DOWN);
        luggage.sendKeys(Keys.ENTER);
        String luggageCount = driver.findElement(By.xpath("//div[contains(@class, 'ng-select')]")).getText();
        System.out.println("Selected Luggage Count: " + luggageCount);

        // Select Gender
        String genderXPath = "(//div[@class='control__indicator'])[2]";
        List<WebElement> genderElements = driver.findElements(By.xpath(genderXPath));
        if (!genderElements.isEmpty()) {
            genderElements.get(0).click();
            String genderValue = driver.findElement(By.xpath("//input[@name='gender' and @checked='checked']")).getAttribute("value");
            System.out.println("Selected Gender: " + genderValue);
        }

        // Notes Text Box
        WebElement textBox = driver.findElement(By.xpath("(//textarea[@placeholder='Notes'])[1]"));
        textBox.sendKeys("Booking " + (tripIndex + 1) + " Notes");

        // Select Vehicle Type
        WebElement vehicleType = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
        vehicleType.click();
        vehicleType.sendKeys(Keys.DOWN);
        vehicleType.sendKeys(Keys.ENTER);
        System.out.println("Selected Vehicle Type: " + vehicleType.getAttribute("value"));

        // Customer Info
        WebElement userName = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        userName.sendKeys("User" + (tripIndex + 1));
        userName.sendKeys(Keys.ENTER);
        System.out.println("Selected User: " + userName.getAttribute("value"));

        // Additional Discount
        WebElement discount = driver.findElement(By.xpath("(//input[@placeholder='Additional Discount'])[1]"));
        discount.sendKeys("10");
        System.out.println("Discount: 10");

        // Extra Charge
        WebElement extraCharge = driver.findElement(By.xpath("(//input[@placeholder='Extra Charge'])[1]"));
        extraCharge.sendKeys("50");
        System.out.println("Extra Charge: 50");

        // Submit the Booking
        driver.findElement(By.xpath("(//button[normalize-space()='submit'])[1]")).click();
        
        // Wait for the form to be submitted (use a wait for confirmation)
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//button[normalize-space()='submit'])[1]")));
    }
}
