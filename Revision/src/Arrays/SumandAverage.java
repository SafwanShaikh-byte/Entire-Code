package Arrays;

public class SumandAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] number = {10,20,30,40,50};
		
		int sum = 0;
		
		for (int i=0;i<=number.length-1;i++)
		{
			sum = sum + number[i];
		}
		System.out.println("Sum is: " + sum);
		
		double average = sum / number.length;
		
		System.out.println("Average is: " + average);

	}

}
