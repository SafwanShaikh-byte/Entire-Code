package String;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Java";
		String b = "Java";
		String c = new String("Java");
		
		//Using == operator
		System.out.println("Using == operator:");
		System.out.println("a == b: " + (a == b)); // true, same reference
		System.out.println("a == c: " + (a == c)); // false, different reference
		System.out.println(a.equals(c)); // true, same content
		System.out.println(a.equalsIgnoreCase("java")); // true, case insensitive
		System.out.println("a.compareTo(c): " + a.compareTo(c)); // 0, same content
		System.out.println( a.compareTo("C++")); // negative value, a is less than "JavaScript"
		

	}

}
