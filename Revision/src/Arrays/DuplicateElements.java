package Arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 2, 4, 6, 8, 4, 2, 10 };

		System.out.println("Duplicate elements:");

		for (int i = 0; i < numbers.length; i++) 
		{
			for (int j = i + 1; j < numbers.length; j++) 
			{
				if (numbers[i] == numbers[j]) 
				{
					System.out.println(numbers[j] + " At Index " + j);
				}
			}
		}
	}

}
