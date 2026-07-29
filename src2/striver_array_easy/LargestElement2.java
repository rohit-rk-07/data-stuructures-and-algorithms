package striver_array_easy;

public class LargestElement2 {
	
	public int largestEle(int arr[], int n) {
		int largest = arr[0];
		for(int i=0;i<=n;i++) {
			if(largest < arr[i]) largest = arr[i];
		}
		return largest;
	}

	public static void main(String[] args) {
		
		int[] arr = {12,23,89,4,23,5,0,7};
		LargestElement2 le = new LargestElement2();
		System.out.println(le.largestEle(arr, arr.length-1));
	}

}
