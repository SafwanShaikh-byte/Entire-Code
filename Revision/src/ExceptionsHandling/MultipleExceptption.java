package ExceptionsHandling;

public class MultipleExceptption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] num = { 10, 20, 30 };
			System.out.println("Accessing element at index 5: " + num[5]); // This will cause
																			// ArrayIndexOutOfBoundsException
			int result = 10 / 0; // This will cause ArithmeticException
			System.out.println("Result: " + result);
		}

		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Exception occurred: " + e.getMessage());
		}

	}

}
