package StaticNonStatic;

public class StaticMethodAccessingNonStaticMethod {

	String message = "Hello from non-static method!";

	void displayMessage() 
	{
		System.out.println(message);
	}

	static void display(){
		// To access non-static method, we need to create an instance of the class
	
		StaticMethodAccessingNonStaticMethod obj = new StaticMethodAccessingNonStaticMethod();
		obj.displayMessage();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		

	}

}
