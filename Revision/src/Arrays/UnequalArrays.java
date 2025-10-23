package Arrays;

public class UnequalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] numbers = {
				{10,20,30},
				{40,50},
				{60,70,80,90}
		};
		
		for (int i=0;i<numbers.length;i++)
		{
			for (int j=0;j<numbers[i].length;j++)
			{
				System.out.print( numbers[i][j] + " ");
			}
			System.out.println();
		}

	}

}
