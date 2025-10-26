package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Alice",30);
		map.put("Bob", 40);
		map.put("Charlie", 25);
		System.out.println("Map Elements : " + map);
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) 
		{
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		

	}

}
