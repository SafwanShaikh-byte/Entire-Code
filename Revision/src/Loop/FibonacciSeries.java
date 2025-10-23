package Loop;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =10;
		
		int a =0;
		int b =1;
		
		System.out.println("Fibonacci Series up to "+n+" terms:");
		
			for (int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			int nextTerm = a + b;
			a = b;
			b = nextTerm;
			
		}
	

	}

}
