package ExceptionsHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try 
		{
			FileReader fr = new FileReader("data.txt");
		} 
		catch (FileNotFoundException e)		
		{
			System.out.println("File not found. Please check the file path.");
		}
	}

}
