

public class Fibonacci {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, a=0,b=0,c=1;
		
		System.out.println("Enter the number of times");
				
		System.out.println("Fibonacci Series of the number is:");
		
		for(int i=0;i<=num;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a + "");
		}
	}

}
