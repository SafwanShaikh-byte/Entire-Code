import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Restassured {

	@BeforeClass
	public void setup() {
		// Base URL for all requests
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	}

	// ✅ GET Request Example
	@Test(priority = 1)
	public void testGetPosts() {
		Response response = RestAssured.given().when().get("/posts/1").then().statusCode(200)
				.body("title", containsString("sunt")).extract().response();

		System.out.println("GET Response:\n" + response.asPrettyString());
	}

	// ✅ POST Request Example
	@Test(priority = 2)
	public void testCreatePost() {
		String body = "{\n" + "  \"title\": \"Safwan\",\n" + "  \"body\": \"QA Tester\",\n" + "  \"userId\": 1\n" + "}";

		Response response = RestAssured.given().contentType(ContentType.JSON).body(body).when().post("/posts").then()
				.statusCode(201).body("title", equalTo("Safwan")).extract().response();

		System.out.println("POST Response:\n" + response.asPrettyString());

		Assert.assertTrue(response.asString().contains("Safwan"));
	}

	// ✅ PUT Request Example
	@Test(priority = 3)
	public void testUpdatePost() {
		String requestBody = "{\n" + "  \"id\": 1,\n" + "  \"title\": \"Safwan Updated\",\n"
				+ "  \"body\": \"Senior QA Engineer\",\n" + "  \"userId\": 1\n" + "}";

		Response response = RestAssured.given().contentType(ContentType.JSON).body(requestBody).when().put("/posts/1")
				.then().statusCode(200).body("title", equalTo("Safwan Updated")).extract().response();

		System.out.println("PUT Response:\n" + response.asPrettyString());
	}

	// ✅ DELETE Request Example
	@Test(priority = 4)
	public void testDeletePost() {
		RestAssured.given().when().delete("/posts/1").then().statusCode(200); // JSONPlaceholder returns 200 for DELETE

		System.out.println("DELETE Request executed successfully!");
	}
}
