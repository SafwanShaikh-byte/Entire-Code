package Constructor;

public class PrivateConstructor {
	
	private static PrivateConstructor instance;
	
	private PrivateConstructor() 
	{
		System.out.println("This is a private constructor.");
	}
	
	public static PrivateConstructor createInstance() 
	{
		if (instance == null) 
		{
			instance = new PrivateConstructor();
		}
		return new PrivateConstructor();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateConstructor obj1 = PrivateConstructor.createInstance();
		PrivateConstructor obj2 = PrivateConstructor.createInstance();
		
	}

}
