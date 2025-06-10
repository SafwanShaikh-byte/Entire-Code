package Test;

public class ReverseString {

	public static void main(String[] args) {
		
		String string = "Hello, Selenium!"; 
		String ReversedString  =  new StringBuilder (string).reverse().toString();
		
		System.out.println("Original String is : " + string);
		System.out.println("Reversed String is : " + ReversedString);
	
	}

}
