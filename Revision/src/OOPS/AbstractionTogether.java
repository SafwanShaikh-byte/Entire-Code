package OOPS;

public class AbstractionTogether {

	abstract class Animal {
		public abstract void eat();
	}

	interface Flyable {
		void fly();
	}

	class Bird extends Animal implements Flyable {
		public void eat() {
			System.out.println("Bird eats seeds.");
		}

		public void fly() {
			System.out.println("Bird flies.");
		}
	}

	class Bird1  extends Animal implements Flyable{
		// TODO Auto-generated method stub

		 public void eat() {
		        System.out.println("Bird eats seeds.");
		    }

		    public void fly() {
		        System.out.println("Bird flies.");
		    }
	}

}
