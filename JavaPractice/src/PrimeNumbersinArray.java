
public class PrimeNumbersinArray {

	  public static void main(String[] args) {
		  int[] numbers = {29, 10, 13, 4, 7, 22, 31, 40};
		  
		  System.out.println("Prime numbers in the array:");
		  
		  for (int number : numbers) 
		  {
			  if (isPrime(number))
				  
			  {
				  System.out.println(number);
			  }
		  }
	  }

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		
		if(number<=1)
		{
			return false;
		}
		
		for (int i=2;i<=Math.sqrt(number);i++)
			
		{
			if (number % i ==0)
			{
				return false;
			}
		}
		return true;
	}

}
