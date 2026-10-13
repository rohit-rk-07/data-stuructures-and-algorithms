package striver_array_hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_II_Better {
	
	public List<Integer> majorityElement(int[] arr) {
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		int threshold = n/3;
		
		for(int i=0;i<n;i++) {
			int num = arr[i];
			map.put(num, map.getOrDefault(num, 0)+1);
			if(map.get(num) == threshold+1) {
				list.add(num);
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		Majority_Element_II_Better obj = new Majority_Element_II_Better();
		int[] arr = {1,1,1,1,3,2,2,2};
		List<Integer> list = obj.majorityElement(arr);
		System.out.println(list);
	}

}
