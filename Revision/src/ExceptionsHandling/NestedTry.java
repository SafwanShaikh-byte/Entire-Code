package ExceptionsHandling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			try
			{
				int [] numbers = {1,2,3,4,5};
				System.out.println(numbers[10]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index is out of bounds. Please check the index.");
			}
			
			try
			{
				int result = 10/0;
				System.out.println("Result is: " + result);
			}
			catch(ArithmeticException  e)
			{
				System.out.println("Cannot divide by zero. Please provide a valid denominator.");
			}
		}
	  catch (Exception e) 
		{
		 
		  System.out.println("Some other exception occurred.");
	  }
	}

}