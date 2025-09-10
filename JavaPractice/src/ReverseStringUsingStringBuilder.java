
public class ReverseStringUsingStringBuilder {

	public ReverseStringUsingStringBuilder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sz = "Hello Eclipse";
		String ReversedString  =  new StringBuilder (sz).reverse().toString();
		
		System.out.println("Original String is : " + sz);
		System.out.println("Reversed String is : " + ReversedString);

	}

}
