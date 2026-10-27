package binarySearchEasy;

public class LowerBoundSortedArr {
	
	//recursive method
	public int lowerBound(int[] arr, int low, int high, int x) {
		if(low > high) return low;
		
		int mid = low + (high - low) / 2;
		if(arr[mid] >= x) {
			return lowerBound(arr, low, mid-1, x);
		} else {
			return lowerBound(arr, mid+1, high, x);
		}
	}
	
	//iterative method
	public int lowerBound2(int[] arr, int n, int x) {
		int low = 0, high = n-1, ans = n;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr[mid] >= x) {
				ans = mid;
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		LowerBoundSortedArr obj = new LowerBoundSortedArr();
		int[] arr = {1, 2, 3, 3, 5, 8, 8, 10, 10, 11};
		int x = 9;
		int res = obj.lowerBound(arr, 0, arr.length-1, x);
		int res2 = obj.lowerBound2(arr, arr.length, x);
		System.out.println(res+"<------->"+res2);
	}

}
