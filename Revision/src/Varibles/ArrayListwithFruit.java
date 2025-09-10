package Varibles;

import java.util.ArrayList;

public class ArrayListwithFruit {
	
	public static void main(String[] args) {

		// Creating an ArrayList

		ArrayList<String> fruits = new ArrayList<>();

		// Adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		// Accessing elements
		System.out.println("First fruit: " + fruits.get(0));

		// Removing an element
		fruits.remove("Banana");

		// Iterating through the ArrayList
		for (String fruit : fruits) {
			System.out.println("Fruit: " + fruit);
		}
	}
}
