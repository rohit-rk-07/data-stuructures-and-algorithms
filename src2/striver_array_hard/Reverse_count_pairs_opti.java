package striver_array_hard;

import java.util.ArrayList;
import java.util.List;

public class Reverse_count_pairs_opti {
	
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
	
	public int mergeSort(int[] arr, int low, int high) {
		if(low>=high) return 0;
		int mid = (low + high)/2;
		int cnt = mergeSort(arr, low, mid);
		cnt += mergeSort(arr, mid+1, high);
		cnt += countPairs(arr, low, mid, high);
		merge(arr, low, mid, high);
		
		return cnt;
	}
	
	public int countPairs(int[] arr, int low, int mid, int high) {
		int right = mid+1, cnt = 0;
		for(int i=low;i<=mid;i++) {
			while(right <= high && (long) arr[i] > 2L * arr[right]) right++;
			cnt += (right - (mid+1));
		}
		
		return cnt;
	}
	
	public int stackUpHere(int[] arr, int n) {
		int cnt = mergeSort(arr, 0, n);
		return cnt;
	}

	public static void main(String[] args) {
		Reverse_count_pairs_opti obj = new Reverse_count_pairs_opti();
		int[] arr = {40, 25, 19, 12, 9, 6, 2};
		int cnt = obj.stackUpHere(arr, arr.length-1);
		System.out.println(cnt);
	}

}
