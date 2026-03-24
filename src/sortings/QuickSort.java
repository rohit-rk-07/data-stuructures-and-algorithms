package sortings;

public class QuickSort {
	
	public void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int pivot_idx = partition(arr, low, high);
			quickSort(arr, low, pivot_idx - 1);
			quickSort(arr, pivot_idx+1, high);
		}
	}
	
	public int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low + 1;
		int j = high;
		
		while(i<=j) {
			while(arr[i] <= pivot && i <= high) {
				i++;
			}
			while(arr[j] > pivot && j>low) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,2,4,1,5,6,2,4};
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

}
