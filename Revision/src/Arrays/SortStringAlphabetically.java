package Arrays;

import java.util.Arrays;

public class SortStringAlphabetically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cities = {"London", "New York", "Tokyo", "Sydney", "Berlin"};
		
		Arrays.sort(cities);
		
		for (String city : cities) 
		{
			System.out.println(city);
		}

	}

}
