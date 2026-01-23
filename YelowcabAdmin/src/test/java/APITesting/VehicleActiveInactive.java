package APITesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class VehicleActiveInactive {

	@Test
	public void verifyActiveVehicleAPI() {

		// Base URI
		RestAssured.baseURI = "http://192.168.1.78:7022";

		// API details
		String vehicleId = "fadd7f210062419fb5ab77229bbb05d7";
		String apiKey = "by485pylucar64pipbr8bfv3tggsscbw";
		String authToken = "Token 7bcpL0zWcsCitR9TMU4gjbh660QewLWsjiSRIJ9h";

		// API Request
		Response response = given().header("apikey", apiKey).header("Authorization", authToken)
				.contentType(ContentType.JSON).log().all().when().get("/api/v3.4/vehicle/active/" + vehicleId).then()
				.log().all().statusCode(200).extract().response();

		// Assertions
		Assert.assertNotNull(response.getBody(), "Response body is null");
		Assert.assertTrue(response.getTime() < 3000, "Response time exceeded limit");

		// Optional field validation (enable if present)
		// Assert.assertEquals(response.jsonPath().getBoolean("active"), true);
	}
}
