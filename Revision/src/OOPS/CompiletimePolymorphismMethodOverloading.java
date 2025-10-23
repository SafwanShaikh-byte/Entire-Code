package OOPS;

public class CompiletimePolymorphismMethodOverloading {

	// Method Overloading: Same method name with different parameters
	public int add(int a) {
		return a + 10;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompiletimePolymorphismMethodOverloading cal = new CompiletimePolymorphismMethodOverloading();

		cal.add(5);
		cal.add(5, 10);
		cal.add(5, 10, 15);

		System.out.println("Addition with one parameter: " + cal.add(5));
		System.out.println("Addition with two parameters: " + cal.add(5, 10));
		System.out.println("Addition with three parameters: " + cal.add(5, 10, 15));

	}

}
