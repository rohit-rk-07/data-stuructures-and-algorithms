package striver_array_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class III_Sum_Problem_Opti {
	
	public List<List<Integer>> iiiSum(int[] arr, int n) {
		
		Arrays.sort(arr);
		List<List<Integer>> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int left = i+1, right = n-1;
			if(i>0 && arr[i] == arr[i-1]) continue;
			while(left < right) {
				int sum = arr[i]+arr[left]+arr[right];
				if(sum == 0) {
					list.add(Arrays.asList(arr[i], arr[left], arr[right]));
					left++;
					right--;
					
					while(left < right && arr[left] == arr[left-1]) left++;
					while(left < right && arr[right] == arr[right+1]) right--;
				} else if(sum < 0) left++;
				else right--;
			}
		}
		
		return list;
	}
	

	public static void main(String[] args) {
		int[] arr2 = {-2,-1,-1,0,0,0,2,2,2,-1,-2,-2};
		int[] arr1 = {-1,0,1,2,-1,-4};
		int[] arr = {-2,0,1,1,2};
		int n = arr.length;

		III_Sum_Problem_Opti obj = new III_Sum_Problem_Opti();
		List<List<Integer>> res = obj.iiiSum(arr, n);
		System.out.println(res);
	}

}
