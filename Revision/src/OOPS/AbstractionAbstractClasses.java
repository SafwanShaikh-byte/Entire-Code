package OOPS;

public class AbstractionAbstractClasses {

    // FIX: Add 'static' here
    static abstract class Animal {
        // Concrete method
        public void sleep() {
            System.out.println("This animal sleeps");
        }
        // Abstract method (no implementation)
        public abstract void makeSound();
    }

    // FIX: Add 'static' here
    static class Dog extends Animal {
        // Implementing the abstract method from Animal
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // FIX: Add 'static' here
    static class Cat extends Animal {
        // Implementing the abstract method from Animal
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        
        // No outer class object needed now
        Animal myDog = new Dog(); 
        myDog.makeSound(); 
        myDog.sleep(); 
        
        Animal myCat = new Cat();
        myCat.makeSound(); 
        myCat.sleep();  
    }
}