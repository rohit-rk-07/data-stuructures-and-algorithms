package striver_array_hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_Sum_Problem_Better {
	
	public Set<List<Integer>> threeSum(int[] arr) {
		Set<List<Integer>> set = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int k = -(arr[i] + arr[j]);
				if(map.containsKey(k)) {
					List<Integer> temp = Arrays.asList(arr[i], arr[j], k);
					Collections.sort(temp);
					set.add(temp);
				}
				map.put(arr[j], 0);
			}
			map.clear();
		}
		
		return set;
	}

	public static void main(String[] args) {
		Three_Sum_Problem_Better obj = new Three_Sum_Problem_Better();
		int[] arr = {-1, 0, 1, 2, -1, -4};
		int[] arr2 = {-1,0,1,0};
		Set<List<Integer>> res = obj.threeSum(arr2);
		System.out.println(res);

	}

}
