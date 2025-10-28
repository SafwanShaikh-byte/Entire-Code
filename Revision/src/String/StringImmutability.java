package String;

public class StringImmutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java";
        s.concat(" Rocks");
        
        System.out.println(s); // Still "Java"
        
        s = s.concat(" Rocks");
        System.out.println(s);

	}

}
