package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		
		String rev = "";
		
		for (int i=str.length()-1;i>=0;i--)
		{
			rev += str.charAt(i);
			
		}
		
		System.out.println("forward String : " + str);
		System.out.println("Reversed String : " + rev);

	}

}
