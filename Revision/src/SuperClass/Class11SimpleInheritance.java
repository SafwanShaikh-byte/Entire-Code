package SuperClass;

public class Class11SimpleInheritance extends Class1 {
	
	void bark() {
		System.out.println("Barking...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class11SimpleInheritance dog = new Class11SimpleInheritance();
		dog.bark();
		dog.eat();

	}

}
