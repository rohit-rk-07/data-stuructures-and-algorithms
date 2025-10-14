package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		
		//.put() method
		map.put(2, "Lois");
		map.put(3, "Chris");
		map.put(1, "Peter");
		map.put(6, "Brain");
		map.put(4, "Meg");
		map.put(5, "Steve");
		map.put(7, "Quagmire");
		map.put(8, "Cling");
		map.put(9, "John");
		
		System.out.println(map);
		
		//.get() method
		System.out.println("\nget method: "+map.get(1));
		
		//.remove() method
		String result = map.remove(9);
		System.out.println("\nremoved "+result);
		String result1 = map.remove(8);
		System.out.println("removed "+result1);
		
		//.containsKey() method
		System.out.println("\ncontains key ?, "+map.containsKey(2));
		System.out.println("contains key ?, "+map.containsKey(9));
		
		//.containsValue() method
		System.out.println("\ncontains value ?, "+map.containsValue("Lois"));
		System.out.println("contains value ?, "+map.containsValue("John"));
		
		//Looping Map by .keySet();
		System.out.println("\nloop by using the .KeySet();");
		Set<Integer> keys = map.keySet();
		for(int i : keys) {
			System.out.print(i+":"+map.get(i)+", ");
		}
		
		//Looping Map by entrySet();
		System.out.println();
		System.out.println("\nloop by using the entrySet();");
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		
		for(Map.Entry<Integer, String> entry : entries) {
			System.out.print(entry.getKey()+":"+entry.getValue()+", ");
		}
	}
}
