package striver_array_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Missing_Repeating_Num {
	
	public List<Integer> find_missing_repeating(int[] arr) {
		int n=arr.length;
		int repeating = -1, missing = -1;
	
		for(int i=0;i<n;i++) {
			int cnt=0;
			for(int j=0;j<n;j++) {
				if(arr[j] == arr[i]) {
					cnt++;
				}
				if(cnt == 2) {
					repeating = arr[i];
				} else if(cnt == 0) {
					missing = i;
				} else if(repeating != -1 && missing != -1) break;
				
			}
		}
		return Arrays.asList(missing, repeating);
	}

	public static void main(String[] args) {
		int[] arr = {6,3,1,1,2,4};
		Missing_Repeating_Num obj = new Missing_Repeating_Num();
		List<Integer> res = obj.find_missing_repeating(arr);
		System.out.println(res);
	}

}
