package Arrays;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] vowels = {'A', 'E', 'I', 'O', 'U'};
		
		for (int i=vowels.length-1;i>=0;i--)
		{
			System.out.println("Vowel at index " + i + ": " + vowels[i]);
		}

	}

}
