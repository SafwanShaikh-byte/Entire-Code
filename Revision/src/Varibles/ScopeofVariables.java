package Varibles;

public class ScopeofVariables {
	
	int a =50;
	
	public void show()
	{
		int a =10;
		
		System.out.println("Local Variable : " + a);
		System.out.println("Global Variable : " + this.a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScopeofVariables obj = new ScopeofVariables();
		
		obj.show();

	}

}
