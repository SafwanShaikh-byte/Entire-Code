package OOPS;

public class InheritanceChild extends InheritanceParent {

	String breed;

	// Constructor for Dog
	public InheritanceChild(String name, int age,String breed) {
		super(name, age);
		this.breed=breed;
		// TODO Auto-generated constructor stub
	}

	// Overriding makeSound method
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
	
	public void displayDetails() 
	{
		super.displayDetails();
		System.out.println("Breed: " + breed);
	}

}
