package StaticNonStatic;

public class NonStaticMethod {
	
	int data; // Non-static variable
	String name; // Non-static variable
	
	void displayinfo(int c,String n) 
	{ // Non-static method
		data = c;
		name = n;
		System.out.println("Data: " + data);
		System.out.println("Name: " + name);
	}
	
	void usingThis(int data,String name) 
	{ // Non-static method
		System.out.println("Using this keyword : ");
		
		this.data = data;
		this.name = name;
		
		System.out.println("Data: " + this.data);
		System.out.println("Name: " + this.name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticMethod obj = new NonStaticMethod();
		obj.displayinfo(100, "Hello"); // Accessing non-static method
		
		obj.usingThis(200, "World");

	}

}
