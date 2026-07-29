package striver_array_easy;

public class SecondLargest2 {

	public void logic(int arr[], int n) {
		int largest = arr[0];
		for(int i=0;i<=n;i++) {
			if(arr[i] > largest) largest = arr[i];
		}
		
		System.out.println("largest: "+largest);
		
		int second_large = 0;
		for(int i=0; i<=n; i++) {
			if(arr[i] > second_large && arr[i] != largest) second_large=arr[i];
		}
		
		System.out.println("second_largest: "+second_large);
	}
	
	public static void main(String[] args) {
		int[] arr = {4,1,3,7,2,5,6,9};
		SecondLargest2 obj = new SecondLargest2();
		obj.logic(arr, arr.length-1);
	}

}
