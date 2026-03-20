package sortings;

import java.util.ArrayList;
import java.util.List;

public class Merge_Sort {
	
	public void merge(int arr[], int low, int mid, int high) {
		List<Integer> temp = new ArrayList<>();
		int left = low, right = mid+1;
		
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) temp.add(arr[left++]);
			else temp.add(arr[right++]);
		}
		
		while(left <= mid) temp.add(arr[left++]);
		
		while(right <= high) temp.add(arr[right++]);
		
		for(int i=low; i<=high; i++) {
			arr[i] = temp.get(i - low);
		}
	}
	
	public void merge_sort_core(int arr[], int low, int high) {
		if(low >= high) return;
		int mid = (low+high)/2;
		
		merge_sort_core(arr, low, mid);
		
		merge_sort_core(arr, mid+1, high);
		
		merge(arr, low, mid, high);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge_Sort obj = new Merge_Sort();
		int arr[] = {3,1,2,4,1,5,6,2,4};
		obj.merge_sort_core(arr, 0, arr.length-1);
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

}
