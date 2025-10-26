package Collection;

import java.util.Map;
import java.util.TreeMap;

public class MapTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> countries = new TreeMap<>();
		countries.put("US", "United States");
		countries.put("IN", "India");
		countries.put("CN", "China");
		countries.put("JP", "Japan");
		System.out.println("Countries Map: " + countries);
		
		System.out.println("\nTreeMap (Key-Sorted):");
		
		for (Map.Entry<String, String> entry : countries.entrySet()) 
		{
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

}
