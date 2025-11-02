package String;

public class CounttheOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sz = "aaaaaaaaaaaa";
		
		char target  = 'b';
		int count = 0;
		int word = sz.length();
		
		for  (int i=0;i<word;i++)
		{
			if (sz.charAt(i)==target)
			{
				count++;
			}
		}

		System.out.println("The word : " + target + " Appears in word : " + sz + "\t" + count + " : times" );
		System.out.println("Length of String : " + word);
		
	}

}
