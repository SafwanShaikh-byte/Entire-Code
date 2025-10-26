package StaticNonStatic;

public class StaticandNonStaticMethods {
	
	static int add(int a,int b)
	{
		return a+b;
	}

	int multiply(int a , int b)
	
	{
		return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = StaticandNonStaticMethods.add(5, 10);
		System.out.println("Sum: " + sum);
		
		StaticandNonStaticMethods obj = new StaticandNonStaticMethods();
		int product = obj.multiply(3, 5);
		System.out.println("Product: " + product);

	}

}
