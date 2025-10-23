package Constructor;

public class DefaultConstructor {

	String brand = "Unkonwon";
	int year = 0;
	
	// Default Constructor
	public DefaultConstructor()
	{
		System.out.println("This is a Default Constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultConstructor car1 = new DefaultConstructor();
		
		System.out.println("Brand : " + car1.brand);

		System.out.println("Year : " + car1.year);

	}

}
