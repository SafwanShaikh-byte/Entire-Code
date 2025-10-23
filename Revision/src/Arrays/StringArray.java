package Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] names = {"Alice", "Bob", "Charlie", "Diana"};
		
		/*for  (int i=0;i<names.length;i++)
		{
			System.out.println("Name at index " + i + ": " + names[i]);
		}*/
		
		for (String name : names)
		{
			System.out.println("Name: " + name);
		}

	}

}
