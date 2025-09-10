package YelowCab.myproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v138.network.Network;
import org.openqa.selenium.devtools.v138.network.model.Request;

public class APICount {

	public static void main(String[] args) throws InterruptedException {
		// Setup ChromeDriver
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(options);

		options.addArguments("--disable-notifications");

		// Setup DevTools
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		// Enable Network Monitoring
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty(), java.util.Optional.empty()));

		// API pattern to monitor
		String targetAPI = "/api"; // <-- change to match your target API endpoint

		List<String> apiCalls = new ArrayList<>();

		// Add listener for network requests
		devTools.addListener(Network.requestWillBeSent(), request -> {
			Request req = request.getRequest();
			if (req.getUrl().contains(targetAPI)) {
				System.out.println("API Called: " + req.getUrl());
				apiCalls.add(req.getUrl());
			}
		});

		// Navigate to your site
		driver.get("https://yelowcab.yelowsoft.co/login");
		Thread.sleep(1000L);
		driver.findElement(By.id("inputEmail")).sendKeys("support+12@yelowsoft.com");
		driver.findElement(By.id("inputPassword")).sendKeys("pbdev@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(1000L);
		System.out.println("Total times API called: " + apiCalls.size());
	}
}