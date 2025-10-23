package OOPS;

public class InheritanceParent {
	// Properties of ParentClass
	
	String name;
	int age;

	// Constructor for Animal
	public InheritanceParent(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}

	// Method to make sound (Can be overridden in subclass)
	public void makeSound() 
	{
		System.out.println("Animal makes a sound");
	}

	// Method to display details
	public void displayDetails() 
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
