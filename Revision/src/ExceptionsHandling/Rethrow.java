package ExceptionsHandling;

public class Rethrow {

	
	static void riskyMethod() throws Exception {
		
		try {
			
			int a=10/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught inside Method. Re Throwing...");
			throw e; // Rethrowing the exception
		}
	}

		public static void main(String[] args) {
			
			try {
				riskyMethod();
			}
			catch(Exception e) {
				System.out.println("Caught in main: " + e.getMessage());
			}
		}
	

}
