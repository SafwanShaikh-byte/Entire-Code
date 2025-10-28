package String;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Test");
        String s2 = s1.intern();
        String s3 = "Test";

        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); 
	}

}
