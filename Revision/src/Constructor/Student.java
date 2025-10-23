package Constructor;

public class Student {
	
	String name;
	int age;
	
	// Default Constructor
	public Student(String n,int a)
	{
		name=n;
		age=a;	
	}

	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Student s1 = new  Student("Alice",20);
		s1.display();
		Student s2 = new  Student("Bob",22);
		s2.display();
	}

}
