package striver_array_easy;

import java.util.ArrayList;
import java.util.List;

public class UnionArraysOpti {

	//my code logic
	public void unionArrays(int[] arr1, int[] arr2) {
		List<Integer> union = new ArrayList<>();
		
		int i=0, j=0;
		int n1=arr1.length, n2=arr2.length;
		
		while(i < n1 && j < n2) {
			if(arr1[i]<arr2[j] && !union.contains(arr1[i])) {
				union.add(arr1[i]);
				i++;
			} else if(arr2[j] < arr1[i] && !union.contains(arr2[j])) {
				union.add(arr2[j]);
				j++;
			} else if(arr1[i] == arr2[j] && !union.contains(arr1[i])) {
				union.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		while(i<n1){
			if(i<n1 && !union.contains(arr1[i])) {
				union.add(arr1[i]);
				i++;
			}
		} 
		
		while(j<n2) {
			if(j<n2 && !union.contains(arr2[j])) {
				union.add(arr2[j]);
				j++;
			}
		}
		
		for(int val:union) {
			System.out.print(val+" ");
		}
		
	}
	
	//clean code
	public void unionArrays2(int[] arr1, int[] arr2) {
		List<Integer> union = new ArrayList<>();

		int i = 0, j = 0;
		int n1 = arr1.length, n2 = arr2.length;

		while (i < n1 && j < n2) {
			
			if (arr1[i] < arr2[j]) {
				if(union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
					union.add(arr1[i]);
					i++;
				}
				
			} else if (arr2[j] < arr1[i]) {
				if(union.isEmpty() || union.get(union.size()-1) != arr2[j]) {
					union.add(arr2[j]);
					j++;
				}
				
			} else if (arr1[i] == arr2[j]) {
				if(union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
					union.add(arr1[i]);
					i++;
					j++;
				}
			}
		}
		
		while (i < n1) {
			if (i < n1 && union.get(union.size()-1) != arr1[i]) {
				union.add(arr1[i]);
				i++;
			}
		}
		
		while (j < n2) {
			if (j < n2 && union.get(union.size()-1) != arr2[j]) {
				union.add(arr2[j]);
				j++;
			}
		}
		
		for(int val:union) {
			System.out.print(val+" ");
		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7, 8, 9 };
		UnionArraysOpti obj = new UnionArraysOpti();
		obj.unionArrays(arr1, arr2);
	}

}
