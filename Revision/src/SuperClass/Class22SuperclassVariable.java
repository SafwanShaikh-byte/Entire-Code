package SuperClass;

public class Class22SuperclassVariable extends Class2 {
	
	String colour = "Red";
	
	void showcolour() {
		System.out.println(colour);
		System.out.println(super.colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class22SuperclassVariable obj = new Class22SuperclassVariable();
		obj.showcolour();

	}

}
