package binarySearchEasy;

public class BinarySearchIntro {
	
	// binary search by iterative technique
	public int binarySearchIterative(int[] arr, int n, int target)  {
		int low = 0; int high = n-1;
		while(low <= high) {
			int mid = low + (high-low)/2; // to avoid over-flow
			if(arr[mid] == target) return mid;
			else if(target > arr[mid]) low = mid + 1;
			else high = mid - 1;
		}
		return -1;
	}
	
	// binary search by recursive technique
	public int binarySearchRecursive(int[] arr, int low, int high, int target) {
		if(low >= high) return -1;
		int mid = low + (high - low) / 2;
		if(arr[mid] == target) 
			return mid;
		else if(target > arr[mid])
			return binarySearchRecursive(arr, mid+1, high, target);
		else 
			return binarySearchRecursive(arr, low, mid - 1, target);
	}

	public static void main(String[] args) {
		BinarySearchIntro obj = new BinarySearchIntro();
		int[] arr = {3,4,6,7,9,12,16,17};
		int res = obj.binarySearchRecursive(arr, 0, arr.length, 6);
		System.out.println(res);
	}

}
