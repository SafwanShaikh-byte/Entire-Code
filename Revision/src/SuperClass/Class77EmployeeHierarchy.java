package SuperClass;

public class Class77EmployeeHierarchy extends Class7 {
	
	String department;
	
	Class77EmployeeHierarchy (String name, double salary, String department)
	{
		super(name, salary);
		this.department = department;
	}
	
	void showEmployeeDetails()
	{
		super.displayDetails();
		System.out.println("Department: " + department);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class77EmployeeHierarchy emp = new Class77EmployeeHierarchy("name", 75000, "Engineering");
		emp.showEmployeeDetails();

	}

}
