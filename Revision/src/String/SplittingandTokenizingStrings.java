package String;

public class SplittingandTokenizingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Apple,Banana;Cherry Orange|Grapes";
		
		// Using split() method with regex
		String[] fruits1 = str.split("[,; |]+");
		
		for (String fruit : fruits1) {
			System.out.println("Using split(): " + fruit);
		}
		
		//limit parameter
		
		String[] parts = "a-b-c-d".split("-", 4);
		
		for (String p : parts)
		{
			System.out.println(p);
		}

	}

}
