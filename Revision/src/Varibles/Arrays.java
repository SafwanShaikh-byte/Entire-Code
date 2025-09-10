package Varibles;

public class Arrays {

	public static void main(StringDemo[] args) {
		// TODO Auto-generated method stub

		// Declare and initialize an array
		int[] numbers = { 10, 20, 30, 40, 50 };

		// Access and print elements using a loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}

		// Modify an element
		numbers[2] = 35; // Change the third element
		System.out.println("Updated element at index 2: " + numbers[2]);

	}

}
