package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(1);
		nums.add(5);
		
		System.out.println(nums);
		
		Collections.sort(nums);
		System.out.println(nums);
	}

}

//sorting an arraylist using the built-in sort function of collections interface;