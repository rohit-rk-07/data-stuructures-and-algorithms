package sortings;

import java.util.List;
import java.util.ArrayList;

class MergeLogic {
	
	public void merge(int[] arr, int low, int mid, int high) {
		List<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}
		
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		
		for(int i=low; i<=high; i++) {
			arr[i] = temp.get(i-low);
		}
	}
	
	public void mergeSort(int[] arr, int low, int high) {
		if(low>=high) return;
		int mid = (low + high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
}

public class MergeSort2 {

	public static void main(String[] args) {
		int[] arr = {3,1,2,4,1,5,6,2,4};
		int low = 0;
		int high = arr.length-1;
		
		MergeLogic ml = new MergeLogic();
		ml.mergeSort(arr, low, high);
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

}
