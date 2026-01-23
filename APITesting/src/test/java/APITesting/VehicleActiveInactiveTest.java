package APITesting;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.ApiConstants;
import Base.BaseTest;

import static io.restassured.RestAssured.given;

public class VehicleActiveInactiveTest extends BaseTest {

	@Test
	public void verifyActiveVehicleAPI() {

		Response response = given().header("apikey", ApiConstants.API_KEY) // ✅ FIXED
				.contentType(ContentType.JSON).log().all().when()
				.get("/api/v3.4/vehicle/active/" + ApiConstants.VEHICLE_ID).then().log().all().statusCode(200).extract()
				.response();

		Assert.assertNotNull(response.getBody(), "Response body is null");
	}
}
