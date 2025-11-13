package RuffPractice;

public class StringManipulation {

	public static String removeDuplicates(String input) 
	{
		StringBuilder result = new StringBuilder();
	
		for (char c : input.toCharArray()) 
		{
			if (result.indexOf(String.valueOf(c)) == -1) {
				result.append(c);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "automation";
		String output = removeDuplicates(input);
		System.out.println("Output: " + output);

	}

}
