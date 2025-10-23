package SuperClass;

public class Class44SuperMethod extends Class4 {
	
	void sound() 
	{
		super.sound();
		System.out.println("Dog Barks");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class44SuperMethod obj = new Class44SuperMethod();
		obj.sound();

	}

}
