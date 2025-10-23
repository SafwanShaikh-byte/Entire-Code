package OOPS;

public class AbstractionInterfaceClasses {

	interface Animal {
		// Abstract method (no implementation)
		void makeSound();

		// Default method (Java 8+)
		default void sleep() {
			System.out.println("This animal sleeps");
		}
	}

	static class Dog implements Animal {
		// Implementing the abstract method from Animal
		public void makeSound() {
			System.out.println("Dog barks");
		}
	}

	static class Cat implements Animal {
		// Implementing the abstract method from Animal
		public void makeSound() {
			System.out.println("Cat meows");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal myDog = new Dog();
        myDog.makeSound();  // Output: Dog barks
        myDog.sleep();      // Output: This animal sleeps

        Animal myCat = new Cat();
        myCat.makeSound();  // Output: Cat meows
        myCat.sleep();  
	}

}
