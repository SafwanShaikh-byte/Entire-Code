package Constructor;

public class ConstructorCounter {
	
	static int count = 0;
	
	public ConstructorCounter() 
	{
		count++;
		System.out.println("Number of objects created: " + count);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorCounter obj1 = new ConstructorCounter();
		ConstructorCounter obj2 = new ConstructorCounter();
		ConstructorCounter obj3 = new ConstructorCounter();
		ConstructorCounter obj4 = new ConstructorCounter();
		
		System.out.println("Total objects created: " + ConstructorCounter.count);

	}

}
