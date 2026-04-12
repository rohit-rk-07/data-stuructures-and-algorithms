package striver_array;

import java.util.List;
import java.util.ArrayList;

public class Union_arr {

	public List<Integer> Union(int[] arr1, int[] arr2, int n, int m) {
		List<Integer> union = new ArrayList<>();

		int i = 0, j = 0;
		while (i < n && j < m) {

			if (arr1[i] < arr2[j]) {
				union.add(arr1[i]);
				i++;
			}

			else if (arr2[j] < arr1[i]) {
				union.add(arr2[j]);
				j++;
			}

			else {
				union.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		while(i<n) {
			union.add(arr1[i]);
			i++;
		}
		
		while(j<m) {
			union.add(arr2[j]);
			j++;
		}

		return union;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Union_arr obj = new Union_arr();
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 2, 3, 4, 5 };
		int n = arr1.length;
		int m = arr2.length;
		List<Integer> result = obj.Union(arr1, arr2, n, m);
		for(int val : result) System.out.print(val+" ");
	}

}
