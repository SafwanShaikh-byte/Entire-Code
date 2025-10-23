package OOPS;

public class EncapsulationBothway {
	
	private String name;
	private int age;
	private String address;
	double salary;
	
	/*// Constructor
	public Common(String name, int age, String address, double salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		
	}*/
	
	public void name(String name)
	{
		this.name = name;
	}
	
		
	public String getName() {
		return name;
	} 
	
	public void age(int age)
	{
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void address(String address)
	{
		this.address = address;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	public void salary(double salary)
	{
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Common person = new Common("John Doe", 30, "1179/B Baker Street, London", 55000.50);
		

		EncapsulationBothway person = new EncapsulationBothway();		
		person.name("Safwan Shaikh");
		person.age(33);
		person.address("1179/B Baker Street, London");
		person.salary(55000.00);
		
		
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Address: " + person.getAddress());
		System.out.println("Salary: " + person.getSalary());
								
	}

}
