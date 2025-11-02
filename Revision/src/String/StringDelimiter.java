package String;

import java.util.Arrays;

public class StringDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sz = "chrome,firefox,edge";
		
		String[] del = sz.split(",");
		
		System.out.println(Arrays.toString(del));
		System.out.println(del);
		
		

	}

}
