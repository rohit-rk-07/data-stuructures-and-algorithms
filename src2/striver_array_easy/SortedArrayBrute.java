package striver_array_easy;

public class SortedArrayBrute {

	public boolean isSorted(int[] arr, int n) {
		
		for(int i=0;i<n-1;i++) {
			if(arr[i] > arr[i+1]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6,7,8,2};
		SortedArrayBrute obj = new SortedArrayBrute();
		System.out.println(obj.isSorted(arr, arr.length));
	}

}
