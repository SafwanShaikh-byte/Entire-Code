package Test;

public class Swaptwonumberswithout3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 66;
		int b = 1;
				
		System.out.println("Before Swapping Value of a :" + a);
		System.out.println("Before Swapping Value of b :" + b);
		
		a = a+b; //67
		b = a-b; //67-1 = 66
		a = a-b; // 67-66 = 1
		
		System.out.println("After Swapping Value of a :" + a + ", b : " + b);
	}

}
