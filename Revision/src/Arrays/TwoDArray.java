package Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] numbers = new int[3][3];
		
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		
		numbers[1][2] = 40;
		numbers[1][0] = 50;
		
		
		for (int i=0;i<=numbers.length-1;i++)
		{
			for (int j=0;j<=numbers[i].length-1;j++)
			{
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
