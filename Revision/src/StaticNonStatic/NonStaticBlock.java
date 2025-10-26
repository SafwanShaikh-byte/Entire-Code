package StaticNonStatic;

public class NonStaticBlock {
	
	{
		// Non-static block
		System.out.println("This is a non-static block.");
	}
	
	NonStaticBlock() {
		System.out.println("Constructor is called.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticBlock obj1 = new NonStaticBlock(); // First object creation
		NonStaticBlock obj2 = new NonStaticBlock(); // Second object creation
		
		obj1 = new NonStaticBlock(); // Third object creation
		obj2 = new NonStaticBlock(); // Fourth object creation
		
		
	}

	}
