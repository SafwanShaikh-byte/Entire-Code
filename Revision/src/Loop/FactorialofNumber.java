package Loop;

public class FactorialofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		int fact =1;
		
		for (int i=n;i>=1;i--)
		{
			fact = fact * i;
			
		}
		System.out.println("The factorial of "+n+" is: "+fact);

	}

}
