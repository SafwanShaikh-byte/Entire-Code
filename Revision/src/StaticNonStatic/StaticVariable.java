package StaticNonStatic;

public class StaticVariable {

	static String schoolName = "ABC High School";// Static variable
	static int totalStudents = 500; // Static variable
	
	static void displaySchoolName() 
	
	{ // Static method
		System.out.println("School Name: " + schoolName);
		totalStudents += 1; // Modifying static variable
		System.out.println("Total Students: " + totalStudents);
		
		totalStudents += 1; // Modifying static variable
		System.out.println("Total Students: " + totalStudents);
		
		totalStudents += 1; // Modifying static variable
		System.out.println("Total Students: " + totalStudents);
		
		totalStudents += 10; // Modifying static variable
		System.out.println("Total Students: " + totalStudents);
		
	}
	
	void displayTotalStudents() 
	{ // Non-static method
		System.out.println("Total Students: " + totalStudents);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable.displaySchoolName(); // Accessing static method
		StaticVariable obj = new StaticVariable();
		obj.displayTotalStudents(); // Accessing non-static method
	}

}
