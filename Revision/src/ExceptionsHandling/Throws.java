package ExceptionsHandling;

public class Throws {
	// Method that throws an exception
	static void checkAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Age must be at least 18 to vote.");
		} else {
			System.out.println("You are eligible to vote.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(16);
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}

	}

}
