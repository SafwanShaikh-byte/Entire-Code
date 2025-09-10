package Varibles;

public class Swaptwonumbers {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int a =10;
		int b =20;
		/*int c;
		
		c=a;
		a=b;
		b=c;
		
		
		System.out.println("Swapped Value : " + a);
		System.out.println("Swapped Value : " + b);*/
		
		//Without Third Variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Swapped Value : " + a);
		System.out.println("Swapped Value : " + b);
		
	}

}
