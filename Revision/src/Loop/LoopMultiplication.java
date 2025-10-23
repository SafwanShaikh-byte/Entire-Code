package Loop;

public class LoopMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1;i<=10;i++) 
		{		
			for (int j=1;j<=10;j++) 
			{
				int mul=i*j;
				System.out.print(mul + "\t");
			}
			System.out.println();
		}
	}

}
