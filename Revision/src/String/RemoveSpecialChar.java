package String;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sz = "he@#$*llo Wor$%^&l3451d";
		
		String result 	= sz.replaceAll("[0-9@#$%^&*()]", "");

		System.out.println("Original String: " + sz);
        System.out.println("After removing special characters: " + result);
	}

}
