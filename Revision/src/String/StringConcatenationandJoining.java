package String;

public class StringConcatenationandJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "Java";
		
		// Using + operator
		String result1 = str1 + " " + str2 + " " + str3;
		System.out.println("Using + operator: " + result1);
		
		// Using concat() method
		String result2 = str1.concat(" ").concat(str2).concat(str3);
		System.out.println("Using concat() method: " + result2);
		
		// Using String.join() method
		String result3 = String.join(str1, str2, str3);
		System.out.println("Using String.join() method: " + result3);
	}

}
