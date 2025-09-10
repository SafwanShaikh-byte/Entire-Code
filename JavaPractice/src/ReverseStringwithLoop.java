
public class ReverseStringwithLoop {

	public static void main(String[] args)  {
		// TODO Auto-generated constructor stub
		
		String sz = "Hello World!";
		String rev = "";
		
		System.out.println("Forward String : " + sz);
		
		for (int i=sz.length()-1;i>=0;i--)
			
		{
			
			rev+=sz.charAt(i);
		}
		
		System.out.println("Reverse String : " + rev);
		
	}

}
