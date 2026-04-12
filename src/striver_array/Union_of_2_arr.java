package striver_array;

import java.util.HashMap;

public class Union_of_2_arr {

	public void union_arr(int[] arr, int[] arr2, int n, int n2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=1;i<n-1;i++) {
			map.put(i, arr[i]);
		}
		
		for(int i=1;i<n-1;i++) {
			map.put(i, arr2[i]);
		}
		
		map.forEach((key, value)->{
			System.out.println(key+" : "+value);
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 3, 4, 5 };
		int n = arr.length;
		int n2 = arr2.length;
		Union_of_2_arr obj = new Union_of_2_arr();
		obj.union_arr(arr, arr2, n, n2);
	}

}
