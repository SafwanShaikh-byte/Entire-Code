package APITesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class AllAPIResponseTimeTest {

	@Test
	public void testAllAPIsResponseTime() throws Exception {

		String filePath = "C:\\Users\\Safwan\\Downloads\\Node API Optimisation.xlsx";

		FileInputStream fis = new FileInputStream(filePath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheetAt(0);

		List<Long> responseTimes = new ArrayList<>();

		System.out.println("========= API RESPONSE TIME REPORT =========");

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			Row row = sheet.getRow(i);
			if (row == null)
				continue;

			// 🔹 Adjust column index based on your Excel
			String apiName = getCellValue(row.getCell(0)); // API Name
			String method = getCellValue(row.getCell(1)); // GET/POST
			String url = getCellValue(row.getCell(2)); // Full URL or Endpoint

			if (url.isEmpty()) {
				System.out.println("Skipping Row " + i + " (URL Empty)");
				continue;
			}

			method = method.trim().toUpperCase();

			Response response = null;

			try {

				switch (method) {

				case "GET":
					response = given().relaxedHTTPSValidation().when().get(url);
					break;

				case "POST":
					response = given().relaxedHTTPSValidation().contentType("application/json").body("{}").when()
							.post(url);
					break;

				case "PUT":
					response = given().relaxedHTTPSValidation().contentType("application/json").body("{}").when()
							.put(url);
					break;

				case "DELETE":
					response = given().relaxedHTTPSValidation().when().delete(url);
					break;

				default:
					System.out.println("Unsupported Method: " + method + " → " + apiName);
					continue;
				}

				long time = response.getTime();
				int status = response.getStatusCode();

				System.out.println("-------------------------------------");
				System.out.println("API Name      : " + apiName);
				System.out.println("Method        : " + method);
				System.out.println("Status Code   : " + status);
				System.out.println("Response Time : " + time + " ms");
				System.out.println("-------------------------------------");

				responseTimes.add(time);

			} catch (Exception e) {
				System.out.println("Error calling API: " + apiName);
				System.out.println("Reason: " + e.getMessage());
			}
		}

		workbook.close();
		fis.close();

		// ===== Summary Section =====
		if (!responseTimes.isEmpty()) {

			long max = responseTimes.stream().mapToLong(Long::longValue).max().getAsLong();
			long min = responseTimes.stream().mapToLong(Long::longValue).min().getAsLong();
			double avg = responseTimes.stream().mapToLong(Long::longValue).average().getAsDouble();

			System.out.println("\n========= FINAL SUMMARY =========");
			System.out.println("Total APIs Tested : " + responseTimes.size());
			System.out.println("Average Time      : " + avg + " ms");
			System.out.println("Max Time          : " + max + " ms");
			System.out.println("Min Time          : " + min + " ms");
			System.out.println("==================================");
		} else {
			System.out.println("⚠ No APIs were executed.");
		}
	}

	// 🔹 Safe Cell Reader
	private String getCellValue(Cell cell) {

		if (cell == null)
			return "";

		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue().trim();
		case NUMERIC:
			return String.valueOf((long) cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		default:
			return "";
		}
	}
}
