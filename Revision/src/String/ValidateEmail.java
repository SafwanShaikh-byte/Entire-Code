package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	public static void main(String[] args) {
		String email1 = "user@example.com";
		String email2 = "invalid-email@com";

		System.out.println(email1 + " → " + (isValidEmail(email1) ? "Valid" : "Invalid"));
		System.out.println(email2 + " → " + (isValidEmail(email2) ? "Valid" : "Invalid"));
	}

	// Method to validate email using regex
	public static boolean isValidEmail(String email) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	}
}
