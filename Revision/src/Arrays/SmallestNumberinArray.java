package Arrays;

public class SmallestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 25, 47, 3, 19, 55, 88, 12 };

		int smallest = numbers[0];

		for (int num : numbers) {
			if (num < smallest) {
				smallest = num;
			}

		}
		System.out.println("Smallest Number is : " + smallest);

	}

}
