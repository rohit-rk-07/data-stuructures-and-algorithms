package linked_hash_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K, V> {
	
	private int capacity;
	
	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}
	
	protected boolean removeEldestEntry(Map.Entry<K, V>eldest) {
		return size()>capacity;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache<String, Integer> studentMap = new LRUCache<>(3);
		studentMap.put("Peter",99);
		studentMap.put("Lois",89);
		studentMap.put("Chris",80);
		studentMap.put("Steve",90);
		studentMap.put("Meg",78);
		System.out.println(studentMap);
	}

}
