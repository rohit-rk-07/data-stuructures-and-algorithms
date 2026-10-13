package striver_array_hard;

import java.util.Arrays;
import java.util.List;

public class Missing_Repeating_Num_Better {
	
	public List<Integer> missing_repeating(int[] arr) {
		int n = arr.length;
		int[] hash = new int[n+1];
		int repeating = -1, missing = -1;
		
		for(int i=0; i<n; i++) {
		    hash[arr[i]]++;
		}
		
		for(int i=1;i<n+1;i++) {
			if(hash[i] == 2) repeating = i;
			if(hash[i] == 0) missing = i;
			if(missing != -1 && repeating != -1) break;
		}
		 
		return Arrays.asList(missing, repeating);
	}
	
	
	public static void main(String[] args) {
		Missing_Repeating_Num_Better obj = new Missing_Repeating_Num_Better();
		int[] arr = {6,3,1,1,2,4};
		List<Integer> res = obj.missing_repeating(arr);
		System.out.println(res);
	}
}
