package Loop;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =12345;
		int rev =0;
		
		for (int i=n;i>0;i=i/10)
		{
			int digit = i % 10;
			rev = rev * 10 + digit;
			
		}
		
		System.out.println("The reverse of number "+n+" is: "+rev);

	}

}
