package ExceptionsHandling;

public class NestedNTryMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
		int a = 10;
		int b=0;
		
		try {
		int c = a/b; // Arithmetic Exception
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception: Division by zero is not allowed." + e.getMessage());
		}
		
		int [] num = new int[3];
		num [5]=50;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer Catch: Array index problem!" + e.getMessage());
		}
		
		System.out.println("Rest of the code...");
	}

}
