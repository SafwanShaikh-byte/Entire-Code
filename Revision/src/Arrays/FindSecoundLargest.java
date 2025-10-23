package Arrays;

public class FindSecoundLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 3, 8, 1, 4};
		
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
        
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element.");
		} else {
			System.out.println("The second largest element is: " + secondLargest);
		}

	}

}
