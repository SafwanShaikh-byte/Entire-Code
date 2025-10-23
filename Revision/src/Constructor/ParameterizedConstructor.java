package Constructor;

public class ParameterizedConstructor {
	
	String name;
	double salary;
	
	// Parameterized Constructor
	public ParameterizedConstructor(String n, double s)
	{
		name = n;
		salary = s;	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConstructor emp1 = new  ParameterizedConstructor("John",50000);
		System.out.println("Name: " + emp1.name);
		System.out.println("Salary: " + emp1.salary);

	}

}
