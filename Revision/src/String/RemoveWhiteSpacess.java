package String;

public class RemoveWhiteSpacess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sz = "Test data";
		
		String rem = sz.replaceAll("\s", "");
		
		System.out.println("Original String : " + sz);
		System.out.println("White Space Removed : " + rem);

	}

}	