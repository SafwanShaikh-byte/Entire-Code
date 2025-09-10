package Varibles;

public class LISVariables{

	// 🔵 Static variable (shared by all instances)
	static int staticCounter = 0;
	
	// 🟢 Instance variable (unique to each object)
	String instanceName;

	// Constructor to set instance variable
	public LISVariables (String name) {
		this.instanceName = name;
		staticCounter++; // Accessing static variable
	}

	// Method demonstrating local variable
	public void showDetails() {
		// 🔴 Local variable (exists only in this method)
		int localId = 100;

		System.out.println("Instance Name: " + instanceName); // instance variable
		System.out.println("Local ID: " + localId); // local variable
		System.out.println("Static Counter: " + staticCounter); // static variable
	}

	public static void main(String[] args) {
		// Create two objects
		LISVariables obj1 = new LISVariables("Object 1");
		LISVariables obj2 = new LISVariables("Object 2");

		// Call method on each
		obj1.showDetails();
		obj2.showDetails();

		// Access static variable without object
		System.out.println("Total Objects Created: " + LISVariables.staticCounter);
	}
}
