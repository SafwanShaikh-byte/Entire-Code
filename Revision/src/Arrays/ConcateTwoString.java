package Arrays;

public class ConcateTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array1 = {"Hello", "World", "Java"};
		String[] array2 = {"Programming", "is", "fun"};
		
		String[] concatenatedArray = new String[array1.length + array2.length];
		int index = 0;
		for (String str : array1) 
		{
			concatenatedArray[index++] = str;
		}
		for (String str : array2) 
		{
			concatenatedArray[index++] = str;
		}	
		System.out.println("Concatenated Array:");
		
		for (String str : concatenatedArray) 
		{
			System.out.print(str + " ");
		}

	}

}
