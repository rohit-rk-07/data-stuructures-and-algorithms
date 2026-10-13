package striver_array_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IVSum_Opti {
	
	public List<List<Integer>> fourSum(int[] arr, int n, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		
		for(int i=0;i<n;i++) {
			if(i>0 && arr[i] == arr[i-1]) continue;
			
			for(int j=i+1;j<n;j++) {
				if(j>i+1 && arr[j] == arr[j-1]) continue;
				
				int k=j+1, l=n-1;
				while(k<l) {
					int sum = arr[i]+arr[j]+arr[k]+arr[l];
					if(sum == target) {
						List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
						list.add(temp);
						l--;
						k++;
						while(k<l && arr[k] == arr[k-1]) k++;
						while(k<l && arr[l] == arr[l+1]) l--;
						
					} else if(sum < target) {
						k++;
						
					} else {
						l--;
					}
				}
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		IVSum_Opti obj = new IVSum_Opti();
		int[] arr = {5,5,1,1,1,3,3,3,2,2,2,4,4,4};
		int[] arr2 = {1,0,-1,0,-2,2};
		int[] arr3 = {1000000000,1000000000,1000000000,1000000000};
		int n = arr3.length, target = -294967296;
		List<List<Integer>> res = obj.fourSum(arr3, n, target);
		System.out.println(res);
	}

}
