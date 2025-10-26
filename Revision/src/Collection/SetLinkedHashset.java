package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Banana");
		set.add("Apple");
		set.add("Orange");
		set.add("Apple"); // Duplicate element
		System.out.println("Set elements: " + set);
		
		for (String fruit : set) 
		{
			System.out.println("Fruit: " + fruit);
		}
		
		set.remove("Orange");
		System.out.println("Set elements: " + set);	

	}

}
