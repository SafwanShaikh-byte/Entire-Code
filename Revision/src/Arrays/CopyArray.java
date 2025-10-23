package Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];
        
        for (int i = 0; i < original.length; i++) {
			copy[i] = original[i];
		}
        
        System.out.println("Original array:");
		for (int num : original) {
			System.out.print(num + " ");
		}
		
		System.out.println("\nCopied array:");
		for (int num : copy) {
			System.out.print(num + " ");
		}
	}

}
