package AccessModifiers;

public class Public {

	public String name = "Public Name";
	
	void showName()	
	{
		System.out.println("Name: " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Public obj = new Public();
		obj.showName();
	}

}
