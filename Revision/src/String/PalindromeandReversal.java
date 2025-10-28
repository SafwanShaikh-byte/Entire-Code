package String;

public class PalindromeandReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

	}

}
