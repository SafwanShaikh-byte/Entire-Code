package Constructor;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() 
	{
		System.out.println("This is a singleton constructor.");
	}
	
	public static Singleton getInstance() 
	{
		if (instance == null) 
		{
			instance = new Singleton();
		}
		return instance;
	}
	
	public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        System.out.println("Are s1 and s2 same? " + (s1 == s2));  // true

	}

}
