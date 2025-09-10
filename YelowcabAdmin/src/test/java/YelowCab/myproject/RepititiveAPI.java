package YelowCab.myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v138.network.Network;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RepititiveAPI {
    public static void main(String[] args) {

        // Setup WebDriverManager for ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        // Start ChromeDriver with the options
        WebDriver driver = new ChromeDriver(options);

        // Cast WebDriver to ChromeDriver for DevTools access
        ChromeDriver chromeDriver = (ChromeDriver) driver;

        // Connect to DevTools
        DevTools devTools = chromeDriver.getDevTools();
        devTools.createSession();

        // Enable Network Domain (to capture network traffic)
        devTools.send(Network.enable(java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));

        // Variable to count API requests
        final int[] apiCount = {0};

        // Listen for network events (API requests)
        devTools.addListener(Network.requestWillBeSent(), request -> {
            if (request.getRequest().getUrl().contains("api")) {  // Check if it's an API request
                apiCount[0]++;
            }
        });

        // Navigate to the website
        driver.get("https://yelowcab.yelowsoft.co/login"); // Replace with the actual URL you want to test

        // Let it run for a while to capture network activity
        try {
            Thread.sleep(10000);  // Wait for 10 seconds to gather network data
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output the number of API requests captured
        System.out.println("Number of API requests in the last 10 seconds: " + apiCount[0]);

        // Close the browser
        driver.quit();
    }
}
