package striver_array_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IVSum {
	
	public List<List<Integer>> fourSum(int[] arr, int n, int target) {
		List<List<Integer>> returnList = new ArrayList<>();	
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					int l = target - (arr[i]+arr[j]+arr[k]);
					if(set.contains(l)) {
						List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k], l);
						returnList.add(list);
					} else {
						set.add(arr[k]);
					}
				}
				set.clear();
			}
		}
		
		return returnList;
	}

	public static void main(String[] args) {
		IVSum obj = new IVSum();
		int[] arr = {1,0,-1,0,-2,2};
		int target = 0, n = arr.length;
		List<List<Integer>> res = obj.fourSum(arr, n, target);
		System.out.println(res);
	}

}
