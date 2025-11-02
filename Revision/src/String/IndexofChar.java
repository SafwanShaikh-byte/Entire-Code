package String;

public class IndexofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sz = "Automation Engineer";
		
		char target = 't';
		
		for (int i=0;i<=sz.length()-1;i++)
			
		{
			
			if (sz.charAt(i)==target)
			{
				System.out.println(i + " ");
			}
		}
		
		
		

	}

}
