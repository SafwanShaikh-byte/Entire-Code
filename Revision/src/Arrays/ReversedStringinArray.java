package Arrays;

public class ReversedStringinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"apple", "banana", "cherry", "date"};
		
		for (String word : words) 
		{
			String reversed = "";
			for (int i = word.length() - 1; i >= 0; i--) 
			{
				reversed += word.charAt(i);
			}
			System.out.println("Original: " + word + " | Reversed: " + reversed);
		}

	}

}
