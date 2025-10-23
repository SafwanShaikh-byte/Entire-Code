package Constructor;



class Car extends VehicleClass {
	Car(String brand) {
		super("Car", "Red",2020); // Calls parent constructor
		System.out.println("Brand: " + brand);
	}
}

public class Main {
	public static void main(String[] args) {
		Car c = new Car("BMW");
		c.displayYear();
	}
}