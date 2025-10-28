package String;

public class ConversionofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int to String
		int num =100;
		String s1 = String.valueOf(num);
		String s2 = Integer.toString(num);
		
		System.out.println("Value of String : " + s1 + "\t"  + s2);
		
		//String to Integer
		
		int n1 = Integer.parseInt("10");
		System.out.println("Value of String : " + n1);
		
		//String to Double
		
		double d = Double.parseDouble("10.5");
		System.out.println("Value of String : " + d);
		
		// char array <-> String
        char[] chars = {'J', 'a', 'v', 'a'};
        String str = new String(chars);
        char[] chArr = str.toCharArray();
        System.out.println("Value of String : " + str);
        
        
		
		

	}

}
