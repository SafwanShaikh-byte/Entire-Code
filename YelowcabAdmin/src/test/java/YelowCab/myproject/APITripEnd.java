package YelowCab.myproject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class APITripEnd {

	public static void main(String[] args) {

		// Base URI
		RestAssured.baseURI = "https://devysapi.yelowtaxi.com";

		// Trip ID
		String tripId = "d8c3e5fa97c74a709d491d8908ccc476";

		// Full request body with all fare types
		String requestBody = "{\n" + "  \"tripId\": \"" + tripId + "\",\n" + "  \"baseFare\": 50.0,\n"
				+ "  \"distanceFare\": 120.5,\n" + "  \"timeFare\": 60.0,\n" + "  \"waitingFare\": 15.0,\n"
				+ "  \"nightFare\": 30.0,\n" + "  \"peakFare\": 20.0,\n" + "  \"extraCharges\": 10.0,\n"
				+ "  \"tollCharges\": 25.0,\n" + "  \"tax\": 18.0,\n" + "  \"discount\": 20.0,\n"
				+ "  \"totalFare\": 328.5,\n" + "  \"paymentMode\": \"CASH\",\n" + "  \"endLocation\": {\n"
				+ "     \"lat\": 19.0760,\n" + "     \"lng\": 72.8777,\n" + "     \"address\": \"Mumbai, India\"\n"
				+ "  },\n" + "  \"endTime\": \"2025-08-26T19:30:00Z\"\n" + // updated to consistent date
				"}";

		// Send POST request
		Response response = RestAssured.given().log().all() // log request
				.header("Content-Type", "application/json")
				// Uncomment and add your token if authentication is required
				// .header("Authorization", "Bearer <your_token>")
				.body(requestBody).post("/api/v3.3/dispatch/complete");

		// Log Response
		response.then().log().all();

		// Check status code and handle errors
		int statusCode = response.getStatusCode();
		if (statusCode != 200) {
			System.err.println("❌ API call failed with status code: " + statusCode);
			System.err.println("Response Body: " + response.getBody().asString());
			return; // exit or handle failure as needed
		}

		// Validate Pricing Fields from Response
		String totalFare = response.jsonPath().getString("data.totalFare");
		String baseFare = response.jsonPath().getString("data.baseFare");
		String distanceFare = response.jsonPath().getString("data.distanceFare");
		String tax = response.jsonPath().getString("data.tax");

		System.out.println("✅ API Response Pricing:");
		System.out.println("Base Fare: " + baseFare);
		System.out.println("Distance Fare: " + distanceFare);
		System.out.println("Tax: " + tax);
		System.out.println("Total Fare: " + totalFare);

		// Assertions
		Assert.assertEquals(Double.parseDouble(totalFare), 328.5, "Total fare mismatch!");
	}
}