package OOPS;

public class RuntimePolymorphismMethodOverriding {
	
	public class Animal {
		void sound() {
			System.out.println("Animal makes a sound");
		}
	}
	
	public class Dog extends Animal {
		void sound() {
			System.out.println("Dog barks");
		}
	}
	
	public class Cat extends Animal {
		void sound() {
			System.out.println("Meow");
		}
	}
					
				

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RuntimePolymorphismMethodOverriding outer = new RuntimePolymorphismMethodOverriding();
		
		Animal myDog = outer.new Dog();
		Animal myCat = outer.new Cat();
		
		myDog.sound(); // Outputs: Dog barks
		myCat.sound(); // Outputs: Meow
		

	}

}
