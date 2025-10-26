package StaticNonStatic;

public class StaticvsNonStaticVariable {

	static String companyName = "TechCorp"; // Static variable

	String employeeName; // Non-static variable
	int id; // Non-static variable

	// Static method
	static void displayCompanyName() 
	
	{
		System.out.println("Company Name: " + companyName);
	}
	
	// Non-static method
	
	void displayEmployeeDetails() 
	{
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee ID: " + id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Accessing static method without creating an object
		StaticvsNonStaticVariable.displayCompanyName();
		
		// Creating an object to access non-static members
		StaticvsNonStaticVariable employee1 = new StaticvsNonStaticVariable();
		StaticvsNonStaticVariable employee2 = new StaticvsNonStaticVariable();
		employee1.employeeName = "Alice";
		employee1.id = 101;
		employee1.displayEmployeeDetails();
		
		employee2.employeeName = "Bob";
		employee2.id = 102;
		employee2.displayEmployeeDetails();
		
		System.out.println();
		System.out.println("---- After Modifying Static Variable ----");
		System.out.println();
				
		StaticvsNonStaticVariable.companyName = "InnoTech"; // Modifying static variable
		
		StaticvsNonStaticVariable.displayCompanyName(); // Displaying modified static variable
		employee1.displayEmployeeDetails();
		employee2.displayEmployeeDetails();
		
		}

}
