package collections_api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class demo{
	
}

public class collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<>(); 
		nums.add(5);
		nums.add(1);
		nums.add(3);
		nums.add(8);
		
		System.out.println(nums.get(0));
		
//		for(int n : nums) {
//			System.out.println(n);
//		}
	}

}

// this was the tuto of collection, list, arraylist and their methods. 
// here the collection is an interface, list is also an interface.
// ArrayList is a class, which can implement and inherit the methods of the collections and list.