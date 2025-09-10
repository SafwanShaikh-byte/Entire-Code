
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sz = "madam";
		
		if(isPalindrome(sz))
		{
			System.out.println("String is Palindrome :" + sz);
		}else
		{
			System.out.println("String is not Palindrome :" + sz);
		}
		
	}

	private static boolean isPalindrome(String sz) {
		// TODO Auto-generated method stub
		
		int left = 0 ;
		int right = sz.length()-1 ;
		
		while (left<right)
		{
			if(sz.charAt(left)!=sz.charAt(right))
			{
				return false;
			}
			
			left++;
			right--;
		}
		
		
		return true;
	}

}
