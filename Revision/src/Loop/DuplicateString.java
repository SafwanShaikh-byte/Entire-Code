package Loop;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] array1 = {"apple", "banana", "cherry", "date", "apple"};
        String[] array2 = {"banana", "cherry", "fig", "apple", "apple"};
        
        System.out.println("Duplicate strings in both arrays:");
        
        for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					System.out.println(array1[i]);
				}
			}
		}
		
	}

}
