package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {

	public static void main(String[] args) {
		
		// List Allow Duplicates
		
		List<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Apple"); // Duplicate
		list.add("Orange");
		list.add("Banana"); // Duplicate
		
		System.out.println("Fruit Lists : " + list);
		
		//Iterating through the list
		
		for (String lists : list)
		{
			System.out.println(lists);
		}
		
		list.remove("Apple"); // Removes the first occurrence of "Apple"
		System.out.println("After removing first occurrence of Apple: " + list);

	}

}
