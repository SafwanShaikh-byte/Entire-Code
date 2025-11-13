package RuffPractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stubb 

		String 	toreverse = "Hello World";
		String reverse = "";
		
		/*StringBuffer str = new StringBuffer(toreverse);
		
		StringBuffer rev = str.reverse();
		
		System.out.println(rev);*/
		
		
		//Using For Loop
		for (int i=toreverse.length()-1;i>=0;i--)
			
		{
			reverse += toreverse.charAt(i);
		}
		
		System.out.print(reverse);
	}

}
