package collections_api;

import java.util.HashMap;
import java.util.Map;

public class Collection3 {

	public static void main(String[] args) {
		
		Map<String, Integer> students = new HashMap<>();
		
		students.put("Peter", 55);
		students.put("Lois", 90);
		students.put("chris", 65);
		students.put("Meg", 75);
		students.put("Stewie", 85);
		
		students.put("chris", 67);
		
		for(String key : students.keySet()) {
			System.out.println(key +" : "+students.get(key));
		}
		
	}

}

// there is the thing about the map interface
// this map does not extend the collections
// but it's a part of collections
// Map stores the data in the key : value pairs
// HashMap class implements the Map interface and its methods too
