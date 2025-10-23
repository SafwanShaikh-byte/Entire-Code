package Loop;

public class tentotengrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("10x10 Grid:");
		
		for (int i = 1; i <= 10; i++) 
		{
			for (int j = 1; j <= 10; j++) 
			{
				System.out.print((i * j) + "\t");
			}
			
			System.out.println();
		}

	}

}
