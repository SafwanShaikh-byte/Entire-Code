package Loop;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for (int i=n;i>=1;i--) 
		{		
			//spaces
			for (int j=n;j>i;j--) 
			{
				System.out.print(" ");
			}
			//stars
			for (int k=1;k<=(2*i-1);k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
