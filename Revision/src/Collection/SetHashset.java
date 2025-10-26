package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetHashset {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Apple"); // Duplicate element
		
		System.out.println("Set elements: " + set);
		
		System.out.println("Set contains 'Banana': " + set.contains("Banana"));
		
		for (String fruit : set) 
		{
			System.out.println("Fruit: " + fruit);
		}
		
		set.remove("Orange");
		System.out.println("Set after removing 'Orange': " + set);

	}

}
