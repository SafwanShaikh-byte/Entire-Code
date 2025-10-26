package ExceptionsHandling;

public class tryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
		
			int result = 10/2;		
			System.out.println("Result is: " + result);
		}
		catch (ArithmeticException e)		
		{
			System.out.println("Cannot divide by zero. Please provide a valid denominator.");
		}
		finally
		{
			System.out.println("This block always executes.");
		}
	}

}
