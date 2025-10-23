package Constructor;

public class Usingthis {

	String brand;
	String model;
	int price;

	// constructor 1

	public Usingthis() 
	{
		this("HP", "Pavilion", 75000);
	}

	// constructor 2

	public Usingthis(String brand, String model) 
	{
		this(brand, model, 70000);
	}

	// constructor 3
	public Usingthis(String brand, String model, int price) 
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	void display() 
	{
		System.out.println(brand + " " + model + " - Rs." + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usingthis laptop1 = new Usingthis();
		laptop1.display();
		Usingthis laptop2 = new Usingthis("Dell", "Inspiron");
		laptop2.display();
		Usingthis laptop3 = new Usingthis("Apple", "MacBook Pro", 150000);
		laptop3.display();

	}

}
