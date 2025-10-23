package SuperClass;

public class Class55Parameterized extends Class5 {
	
	String Breed;
	
	Class55Parameterized(String name, String b)
	{
		super(name);
		Breed = b;
		System.out.println("Constructor of Class55Parameterized: "+ Breed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class55Parameterized obj = new Class55Parameterized( "name" ,"Golden Retriever");
	}

}
