package Varibles;

public class StaticvsNonStaticVariable {
	static String company = "Google";
	String employeeName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticvsNonStaticVariable obj = new StaticvsNonStaticVariable();

		obj.employeeName = "safwan";

		System.out.println("Company Name is :" + company);
		System.out.println("Employee Name is :" + obj.employeeName);

	}

}