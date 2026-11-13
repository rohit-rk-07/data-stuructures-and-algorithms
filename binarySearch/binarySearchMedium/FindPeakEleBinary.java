package binarySearchMedium;

public class FindPeakEleBinary {
	
	public int findPeak(int[] arr, int n) {
		if(n==1) return 0;
		if(arr[0] > arr[1]) return 0;
		if(arr[n-1] > arr[n-2]) return n-1;
		
		int low = 1, high = n-2;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if((arr[mid-1]<arr[mid]) && (arr[mid]>arr[mid+1])) {
				return mid;
			} else {
				if(arr[mid-1] > arr[mid]) high = mid - 1;
				else low = mid + 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 10, 13, 7, 6, 5, 4, 2, 1, 0}; // 13 --> 2
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};   // 8 --> 7
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  //10 --> 9
		int[] arr4 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};  //1 --> 0
		int[] arr5 = {5};                              //5 --> 0 
		FindPeakEleBinary obj = new FindPeakEleBinary();
		int res = obj.findPeak(arr5, arr5.length);
		System.out.println(res);
	}

}
