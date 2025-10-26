package StaticNonStatic;

public class NonStatic {

	int instanceVariable = 10; // Non-static variable
	
	void displayInstanceVariable() 
	{ // Non-static method
		System.out.println("Instance Variable: " + instanceVariable);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStatic obj = new NonStatic();
		obj.displayInstanceVariable(); // Accessing non-static method

	}

}
