package Varibles;

public class primitiveVariable {

	// Constructor
	public primitiveVariable() {
		// You can initialize values here, but avoid using print statements directly.
	}

	// Method to display primitive variables
	void displayPrimitiveData() {
		// Primitive data types
		byte age = 25;
		short year = 2024;
		int population = 1000000;
		long distance = 9876543210L;
		float price = 19.99f;
		double pi = 3.14159;
		char grade = 'A';
		boolean isJavaFun = true;

		// Output
		System.out.println("Age: " + age);
		System.out.println("Year: " + year);
		System.out.println("Population: " + population);
		System.out.println("Distance: " + distance);
		System.out.println("Price: $" + price);
		System.out.println("Pi: " + pi);
		System.out.println("Grade: " + grade);
		System.out.println("Is Java Fun? " + isJavaFun);
	}

	// Main method to run the program
	public static void main(StringDemo[] args) {
		primitiveVariable obj = new primitiveVariable(); // Create object
		obj.displayPrimitiveData(); // Call method
	}
}
