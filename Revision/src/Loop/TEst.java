package Loop;

import java.util.Arrays;

public class TEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "automation";
        char targetChar = 't';
        int count = 0;
        
        for (int i=0;i<=str.length()-1;i++)
        {
        
        	if (str.charAt(i)==targetChar)
        	{
        		count++;
        	}
        	
        }
        System.out.println("Character '" + targetChar + "' appears " + count + " times.");
        }

}
