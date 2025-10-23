package OOPS;

public class Encapsulation 
{

	private String name;
	private int age;
	private double salary;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	


	
		
	public static void main(String[] args) 
	{
	
		Encapsulation obj = new Encapsulation();
		
		obj.setName("Alice");
		obj.setAge(30);
		obj.setSalary(75000.50);
				
		System.out.println("Name is : " + obj.name);
		System.out.println("Age is : " + obj.age);
		System.out.println("Salary is :" + obj.salary);
	}


	
}	
	
