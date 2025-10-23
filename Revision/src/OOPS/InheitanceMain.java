package OOPS;

public class InheitanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InheritanceParent dog = new InheritanceChild("Buddy", 5, "Golden Retriever");

	        // Accessing inherited properties and methods
	        dog.displayDetails();
	        dog.makeSound();  //
	}

}
