package YelowCab.myproject;

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

public class addbooking {

    public static void main(String[] args) throws InterruptedException {
        new addbooking().runTest();
    }

    public void runTest() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--use-fake-ui-for-media-stream", "--disable-geolocation", "--disable-notifications");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Login
        driver.get("https://yelowcab.yelowsoft.co/login");
        driver.findElement(By.id("inputEmail")).sendKeys("support+12@yelowsoft.com");
        driver.findElement(By.id("inputPassword")).sendKeys("pbdev@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        // Switch to Web Booking tab
        driver.switchTo().newWindow(WindowType.TAB).get("https://yelowcab.yelowsoft.co/yelowcab/ride/new-add");
        Thread.sleep(2000);

        // Select Booking Type: Point to Point
        WebElement bookingType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[2]")));
        bookingType.click();
        bookingType.sendKeys("Point to Point");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']")));

        for (WebElement option : driver.findElements(By.xpath("//div[@role='option']"))) {
            if (option.getText().contains("Point to Point")) {
                option.click();
                break;
            }
        }

        System.out.println("Booking Type selected.");

        // Pickup Location
        WebElement pickup = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        pickup.sendKeys("Yelowsoft");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']")));
        pickup.sendKeys(Keys.ENTER);
        System.out.println("Pickup Location: " + driver.findElement(By.xpath("//span[@title]")).getAttribute("title"));

        // Drop-off Location
        WebElement dropOff = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        dropOff.sendKeys("Lal Darwaja");
       
        dropOff.sendKeys(Keys.DOWN, Keys.ENTER);
        Thread.sleep(1000);
        WebElement dropSpan = driver.findElement(By.xpath("//div[@role='option']"));
        System.out.println("Drop-off Location: " + dropSpan.getText());

        // Select Passenger
        WebElement passengerDropdown = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
        passengerDropdown.click();
        Thread.sleep(1000);
        passengerDropdown.sendKeys(Keys.DOWN, Keys.ENTER);
        System.out.println("Passenger selected: " + driver.findElement(By.xpath("//ng-select[5]//span[@title]")).getText());

        // Select Luggage
        WebElement luggageDropdown = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
        luggageDropdown.click();
        Thread.sleep(1000);
        luggageDropdown.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
        System.out.println("Luggage count: " + driver.findElement(By.xpath("//ng-select[6]//span[@title]")).getText());

        // Select Gender
        List<WebElement> genderOptions = driver.findElements(By.xpath("(//div[@class='control__indicator'])[2]"));
        if (!genderOptions.isEmpty()) {
            genderOptions.get(0).click();
            WebElement selectedGender = driver.findElement(By.xpath("//input[@name='gender' and @checked='checked']"));
            System.out.println("Gender selected: " + selectedGender.getAttribute("value"));
        } else {
            System.out.println("Gender element not found.");
        }

        // Select Vehicle
        WebElement vehicle = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
        vehicle.click();
        Thread.sleep(1000);
        vehicle.sendKeys(Keys.DOWN, Keys.ENTER);
        System.out.println("Vehicle selected: " + vehicle.getAttribute("value"));

        // Select Customer
        WebElement customer = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        customer.sendKeys("Safwan Shaikh");
        Thread.sleep(2000);
        customer.sendKeys(Keys.ENTER);
        System.out.println("Customer selected: " + customer.getAttribute("value"));

        // Additional Discount
        WebElement discount = driver.findElement(By.xpath("(//input[@placeholder='Additional Discount'])[1]"));
        discount.sendKeys("20");
        System.out.println("Discount entered: 20");

        // Extra Charge
        WebElement extraCharge = driver.findElement(By.xpath("(//input[@placeholder='Extra Charge'])[1]"));
        extraCharge.sendKeys("50");
        System.out.println("Extra charge entered: 50");

        // Submit Booking
        driver.findElement(By.xpath("(//button[normalize-space()='submit'])[1]")).click();
        System.out.println("Booking submitted successfully.");
    }
}
