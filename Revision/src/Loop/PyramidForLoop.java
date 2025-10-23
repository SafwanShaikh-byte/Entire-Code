package Loop;

public class PyramidForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =7;
		
		for (int i=1;i<=n;i++) 
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
