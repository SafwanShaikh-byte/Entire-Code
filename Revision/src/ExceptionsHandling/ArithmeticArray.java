package ExceptionsHandling;

public class ArithmeticArray {

	public static void main(String[] args)
	{
	try {
	int [] nums = {10, 20, 30, 40, 50};// Array of integers
	int result = 10/0; // This will cause ArithmeticException
	
	System.out.println("Accessing element at index 10: " + nums[10]); // This will cause ArrayIndexOutOfBoundsException
	System.out.println("Result: " + result);
	}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception: Division by zero is not allowed." + e.getMessage());
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Index Out Of Bounds Exception: Invalid array index accessed." + e.getMessage());
	}
	finally {
		System.out.println("Execution of try-catch block is complete.");
	}
	
	}

}
