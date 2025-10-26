package Collection;

import java.util.Set;
import java.util.TreeSet;

public class SetTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new TreeSet<>();
		
		set.add("Banana");
		set.add("Apple");
		set.add("Orange");
		set.add("Apple"); // Duplicate element
		System.out.println("Set elements: " + set);
		
		for (String fruit : set) 
		{
			System.out.println("Fruit: " + fruit);
		}
		
		set.remove("Banana");
		System.out.println("Set elements: " + set);

	}

}
