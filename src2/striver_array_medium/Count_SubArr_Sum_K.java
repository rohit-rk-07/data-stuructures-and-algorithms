package striver_array_medium;

import java.util.HashMap;

public class Count_SubArr_Sum_K {
	
	public int countSubArr(int[] arr, int k) {
		int count = 0, sum = 0, target = 0;
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(i==0) {
				map.put(0, 1);
			}
			sum += arr[i];
			target = sum - k;
			
			if(map.containsKey(target)) {
				count += map.get(target);
//				map.put(target, map.get(target) + 1);
			}
			
			map.put(sum, map.getOrDefault(sum, 0) + 1);
//			map.put(sum, 1);
		}
		
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
		int[] arr2 = {3, 1, 2, 4};
		int k = 5;
		Count_SubArr_Sum_K obj = new Count_SubArr_Sum_K();
		System.out.println(obj.countSubArr(arr, k));

	}

}


//Problem Statement: Given an array of integers and an integer k, return the total number of sub-arrays whose sum equals k. 
//					A sub-array is a contiguous non-empty sequence of elements within an array.

