package StaticNonStatic;

public class StaticNonStaticBlocks {
	
	static 
	{
		System.out.println("This is a static block. It executes when the class is loaded.");
	}
	
	{
		System.out.println("This is a non-static block. It executes when an object is created.");
	}

	
	StaticNonStaticBlocks() 
	{
		System.out.println("This is the constructor. It executes after the non-static block.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating first object:");
		StaticNonStaticBlocks obj1 = new StaticNonStaticBlocks();
		System.out.println();
		StaticNonStaticBlocks obj2 = new StaticNonStaticBlocks();
		

	}

}
