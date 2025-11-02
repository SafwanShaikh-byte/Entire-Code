package String;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sz = "medem";
		
		String  rev = "";
		
		for (int i=sz.length()-1;i>=0;i--)
		{
			rev += sz.charAt(i);
		}

		System.out.println(rev);
		
		if (rev.equals(sz))
		{
			System.out.println("String is Palindrome");
		}
		else
			
		{
			System.out.println("String is not Palindrome");
		}
	}

	
}
