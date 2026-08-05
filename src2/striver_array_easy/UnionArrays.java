package striver_array_easy;

import java.util.HashSet;
import java.util.Set;

public class UnionArrays {
	
	public void union(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		
		for(int val:set) {
			System.out.print(val+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {3,4,5,6};
		UnionArrays obj = new UnionArrays();
		obj.union(arr1, arr2);

	}

}
