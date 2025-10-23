package Loop;

public class SumofNumbersNto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =1000;
		int sum =0;
		for (int i=n;i>=1;i--)
		{
			sum = sum + i;
			
		}
		System.out.println("The sum of numbers from "+n+" to 1 is: "+sum);

	}

}
