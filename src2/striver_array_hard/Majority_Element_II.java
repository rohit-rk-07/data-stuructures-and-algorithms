package striver_array_hard;

import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II {
	
	public List<Integer> majorityElement(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int n = arr.length;
		int count = 0;
		
		for(int i=0;i<n;i++) {
			int num = arr[i];
			if(list.contains(num)) continue;
			
			for(int j=0;j<n;j++) {
				if(arr[j] == num) {
					count++;
					if(count > n/3) list.add(num);
				}
			}
			count = 0;
		}
		
		return list;
	}

	public static void main(String[] args) {
		Majority_Element_II obj = new Majority_Element_II();
		int[] arr = {1,1,1,3,3,2,2,2};
		List<Integer> res = obj.majorityElement(arr);
		System.out.println(res);
	}

}

//Brute-force solution for the Majority Element II Problem
// TC: O(N^2)
// SC: O(N^2)
