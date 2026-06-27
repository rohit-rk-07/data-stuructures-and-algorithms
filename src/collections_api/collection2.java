package collections_api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> nums = new TreeSet<Integer>();
		nums.add(5);
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(9);
		nums.add(6); // this was ignored 
		
		Iterator<Integer> values = nums.iterator();  
		
		while(values.hasNext())
			System.out.println(values.next());
		
//		for(int n : nums) {
//			System.out.println(n);
//		}
	}

}


// set too extends collection
// set is an interface
// and hashset class will implement it and inherits the set methods
// the set will contain only the unique values, doesn't support the duplicate values;