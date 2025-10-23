package Arrays;

public class DiffernetArrayDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Object[] data = {"Alice", 25, 5.8, true,"9"};
		 
		 for (Object item : data)
		 {
			 System.out.println("Item: " + item + ", Type: " + item.getClass().getSimpleName());
		 }

	}

}
