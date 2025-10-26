package ExceptionsHandling;

public class ThrowsException {
	
	static void validateAge(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("Age is not valid to vote.");
		}
		else
		{
			System.out.println("You are eligible to vote.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validateAge(16);

	}

}
