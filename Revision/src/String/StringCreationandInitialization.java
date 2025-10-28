package String;

public class StringCreationandInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Literal way of String creation
		String str1 = "Hello, World!";
		
		//Using new keyword
		String str2 = new String("Hello, Java!");
		
		//Empty String
		String str3 = "";
		
		//char array to String
		char[] charArray = {'J', 'a', 'v', 'a'};
		String str4 = new String(charArray);
		
		//from byte array
		byte[] byteArray = {72, 101, 108, 108, 111};
		String str5 = new String(byteArray);
		
		//Printing the Strings
		
		System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4 + " | " + str5);

	}

}
