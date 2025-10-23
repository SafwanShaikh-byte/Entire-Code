package Arrays;

public class EvenorOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 25, 47, 3, 19, 55, 88, 12 };

		int even = 0;
		int odd = 0;

		for (int num : numbers) {
			if (num % 2 == 0) 
			{
				even++;
				
				System.out.println("Even Number is : " + num);
			} 
			else 
			{
				odd++;
				System.out.println("Odd Number is : " + num);
			}

		}
		System.out.println("Total Number of Even : " + even + "\t  Total Number of Odd : " + odd);

	}

}
