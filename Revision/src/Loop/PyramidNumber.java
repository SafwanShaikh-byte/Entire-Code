package Loop;

public class PyramidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			//Spaces
			for (int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			
			//Numbers
			for (int k=1;k<=(2*i-1);k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
