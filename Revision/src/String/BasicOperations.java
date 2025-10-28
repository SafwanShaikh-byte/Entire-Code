package String;

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java Programming";

		// Length of the string
		System.out.println("Length: " + s.length());

		// Trimming whitespace
		System.out.println("Trimmed: '" + s.trim() + "'");

		// Uppercase and Lowercase
		System.out.println("Uppercase: " + s.toUpperCase());
		System.out.println("Lowercase: " + s.toLowerCase());
		
		//SubString
		System.out.println("Substring(2,6): " + s.substring(2, 6));
		
		//Character operations
		System.out.println("Char at 2: " + s.charAt(2));
		
		//Index operations
		System.out.println("Index of 'a': " + s.indexOf('P'));
		
		//Last index operations
		System.out.println("Last index of 'a': " + s.lastIndexOf('a'));
		
		//Contains, StartsWith, EndsWith, Replace
		System.out.println("Contains 'Java': " + s.contains("Java"));
		System.out.println("Starts with 'Ja': " + s.startsWith("Ja"));
		System.out.println("Ends with 'ing': " + s.endsWith("ing"));
		System.out.println("Replace 'a' with '@': " + s.replace('a', '@'));
		System.out.println("Replace word: " + s.replace("Programming", "Dev"));

	}

}
