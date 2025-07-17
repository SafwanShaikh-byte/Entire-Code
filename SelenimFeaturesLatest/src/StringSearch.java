import java.util.Arrays;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StringSearch {

    public static void main(String[] args) {
        // List of 12 API URLs (replace with your actual API URLs)
        List<String> apiUrls = Arrays.asList(
            "http://192.168.1.12:7001/api/v3.3/base/company_service/config/all?company_id=1973"
            
        );

        // String to search in the API responses
        String searchString = "acct_1BbkMnAZ5QMcq8l3";  // Replace with your string to search

        // Loop through each API URL and check if the string is present
        for (String apiUrl : apiUrls) {
            try {
                System.out.println("Checking API: " + apiUrl);

                // Send GET request
                io.restassured.response.Response response = RestAssured.get(apiUrl);

                // Convert response body to string
                String responseBody = response.getBody().asString();

                // Search for the string in the response
                if (responseBody.contains(searchString)) {
                    System.out.println("String found in API: " + apiUrl);
                } else {
                    System.out.println("String NOT found in API: " + apiUrl);
                }

            } catch (Exception e) {
                System.out.println("Error occurred while accessing " + apiUrl + ": " + e.getMessage());
            }
        }
    }
}
