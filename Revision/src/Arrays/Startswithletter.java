package Arrays;

public class Startswithletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = { "apple", "banana", "avocado", "cherry", "apricot", "grape" };
		char letter = 'a';
		System.out.println("Words starting with letter '" + letter + "':");
		for (String word : words) 
		{
			if (word.toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
				System.out.println(word);
			}
		}
		
	}

}
