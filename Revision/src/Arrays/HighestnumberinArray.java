package Arrays;

public class HighestnumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
        double [] sum = {12.5, 45.8, 32.9, 50.0, 27.3};
        
        double max = sum[0];
        
       /* for (int i=1;i<sum.length;i++)
        
        {
            if (sum[i]>max)
            {
                max=sum[i];
            }
            
        }
        System.out.println("Biggest Number is : " + max);
    }*/
		
		for (double num : sum)
		{
			if (num > max)
			{
				max = num;
			}
		}
		System.out.println("Biggest Number is : " + max);
	}

	}

