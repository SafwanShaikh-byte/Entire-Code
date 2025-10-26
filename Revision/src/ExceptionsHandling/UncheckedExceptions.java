package ExceptionsHandling;

public class UncheckedExceptions {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int [] sum = {1,2,3,4,5};
			System.out.println(sum[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index is out of bounds. Please check the index.");
		}
		

	}

}
