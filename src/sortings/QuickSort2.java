package sortings;

public class QuickSort2 {

	public void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			while(low < high) {
				int pivot = pivot_fun(arr, low, high);
				quickSort(arr, low, pivot-1);
				quickSort(arr, pivot+1, high);
			}
		}
	}
	
	public int pivot_fun(int arr[], int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		
		while(i < j) {
			while(arr[i] <= pivot && i <= high) i++;
			while(arr[j] > pivot && j>=low) j--;
			
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
		
		int[] arr = {3,5,4,2,1,7,6,9};
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

}
