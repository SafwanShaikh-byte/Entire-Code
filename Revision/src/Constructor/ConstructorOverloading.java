package Constructor;

public class ConstructorOverloading {

	String title;
	String Author;
	double price;

	// Constructor 1

	public ConstructorOverloading(String title) {
		this.title = title;
	}

	// Constructor 2
	public ConstructorOverloading(String t, String a) {
		title = t;
		Author = a;
	}

	// Constructor 3
	public ConstructorOverloading(String t, String a, double p) {
		title = t;
		Author = a;
		price = p;
	}

	void display1() {
		System.out.println("Title: " + title);

	}

	void display2() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + Author);
	}

	void display3() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + Author);
		System.out.println("Price: " + price);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ConstructorOverloading book1 = new ConstructorOverloading("Java Programming");
		book1.display1();

		System.out.println();

		ConstructorOverloading book2 = new ConstructorOverloading("Python Programming", "Alice");
		book2.display2();

		System.out.println();

		ConstructorOverloading book3 = new ConstructorOverloading("C++ Programming", "Bob", 29.99);
		book3.display3();
	}

}
