package binarySearchMedium;

public class SearchInRotatedNSorted2 {

	public boolean search(int[] arr, int target) {
		
		int low = 0, high = arr.length-1;
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == target) return true;
			if(arr[low] == arr[mid] && arr[mid] == arr[high]) {
				low++;
				high--;
			}
			
			if(arr[low] <= arr[mid]) {
				if(arr[low] <= target && target <= arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if(arr[mid] <= target && target <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		SearchInRotatedNSorted2 obj = new SearchInRotatedNSorted2();
		int[] arr = {3,1,2,3,3,3,3};
		boolean flag = obj.search(arr, 2);
		System.out.println(flag);

	}

}
