package Arrays;

public class booleanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean [] flags = {true, true, true, true, false};
		
		int trueCount = 0;
		
		for (int i=0;i<flags.length;i++)
		{
			if (flags[i]==true)
			{
				trueCount++;
			}
		}
		System.out.println("Number of true values: " + trueCount);
	}
	

}
