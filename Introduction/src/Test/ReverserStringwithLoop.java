package Test;

public class ReverserStringwithLoop {

	public static void main(String[] args) {
		
		String originalString = "Hello Selenium!";
		
		String reverserString = " ";
		
		for (int i=originalString.length()-1;i>=0;i--)
		{
			reverserString +=  originalString.charAt(i);
		}
		
		System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reverserString);
		
	}

}
