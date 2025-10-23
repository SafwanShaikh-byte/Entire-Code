package Arrays;

public class Longestword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] words = {"apple", "banana", "cherry", "watermelon", "grapefruit"};
		
		String longestWord = "";
		
		for (String word : words) 
		{
			if (word.length() > longestWord.length()) 
			{
				longestWord = word;
			}
		}	
		System.out.println("The longest word is: " + longestWord);

	}

}
