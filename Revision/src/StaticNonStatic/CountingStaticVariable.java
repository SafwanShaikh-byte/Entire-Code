package StaticNonStatic;

public class CountingStaticVariable {
	
	static int count = 0;
	
	CountingStaticVariable()
	{
		count++;
		System.out.println("Number of objects created: " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountingStaticVariable();
		new CountingStaticVariable();
		new CountingStaticVariable();
		
		System.out.println("Final count of objects: " + CountingStaticVariable.count);
		
	}

}
