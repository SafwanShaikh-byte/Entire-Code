package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put(null, 0);
		
		System.out.println("Map Elements: " + map);
		
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) 
		{
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

}
