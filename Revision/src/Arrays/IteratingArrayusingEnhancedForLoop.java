package Arrays;

public class IteratingArrayusingEnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {10,20,30,40,50};
		
		numbers[2] = 100;  // updating the value at index 2
		numbers[4] = 200;  // updating the value at index 4
		
		for (int num : numbers)
		{
			System.out.println("Elements are :" + num);
		}

	}

}
