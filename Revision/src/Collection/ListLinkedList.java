package Collection;

import java.util.LinkedList;
import java.util.List;

public class ListLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(10); // Duplicate
		list.add(30);
		list.add(20); // Duplicate
		
		System.out.println("Number Lists : " + list);
		
		//Iterating through the list
		for (Integer lists : list)
		{
			System.out.println(lists);
		}
		
		list.remove(0); // Removes the first occurrence of 10
		list.remove(1);
		list.remove(0);
		
		System.out.println("Number Lists : " + list);
		
	}

}
