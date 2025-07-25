import java.util.Arrays;
import java.util.List;

import io.restassured.RestAssured;

public class StripeSearch {

    public static void main(String[] args) {
        // List of 12 API URLs (replace with your actual API URLs)
        List<String> apiUrls = Arrays.asList(
            "http://192.168.1.12:7001/api/v3.3/base/service_configuration/177",
            "http://192.168.1.12:7001/api/v3.3/base/module/config?page=1&module_key=cm_038",
            "http://192.168.1.12:7001/api/v3.3/base/module/config/fc156f372de34ec6b2dfea0fabe39b70",
            "http://192.168.1.12:7001/api/v3.3/base/module/config/fc156f372de34ec6b2dfea0fabe39b70",
            "http://192.168.1.12:7001/api/v3.3/base/company_module/config/all?company_id=1973",
            "http://192.168.1.12:7001/api/v3.3/base/company_service/config/all?company_id=1973",
            "http://192.168.1.12:7001/api/v3.3/base/service_configuration/encrypt/0005f55e74544f4aab5349cafbc37790",
            "http://192.168.1.12:7001/api/v3.3/base/company_service/config/1973",
            "http://192.168.1.12:7001/api/v3.3/base/service_configuration/encrypt/0005f55e74544f4aab5349cafbc37790",
            "http://192.168.1.12:7001/api/v3.3/base/company_service/config?service_type_id=0&service_category_id=30&service_module_category_key=general&is_super_admin=1",
            "http://192.168.1.12:7001/api/v3.3/base/company_service/config/encrypt?service_type_id=0&service_category_id=30&service_module_category_key=general&is_super_admin=1",
            "http://192.168.1.12:7001/api/v3.3/base/company_service/config/1973",
            "http://192.168.1.12:7001/api/v3.3/base/company_service/config/encrypt/1973",
            "http://192.168.1.12:7001/api/v3.3/base/company_module?company_id=1973&service_type_id=14,0&is_configurable=1",
            "http://192.168.1.12:7001/api/v3.3/base/company_module/encrypt?company_id=1973&service_type_id=14%2C0&is_configurable=1",
            "http://192.168.1.12:7001/api/v3.3/base/company_module/config/dspm_001?company_id=1973",
            "http://192.168.1.12:7001/api/v3.3/base/company_module/config/encrypt/dspm_001?company_id=1973",
            "http://192.168.1.12:7001/api/v3.3/base/company_module/config/1422dcd36f6fa449d0874b7613a6134045",
            "http://192.168.1.12:7001/api/v3.3/base/company_module/config/encrypt/1422dcd36f6fa449d0874b7613a6134045"
        );

        // String to search in the API responses
        String searchString = "sk_";  // Replace with your string to search

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
