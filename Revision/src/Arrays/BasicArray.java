package Arrays;

public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 10;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
	}

}
