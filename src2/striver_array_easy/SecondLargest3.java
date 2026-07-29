package striver_array_easy;

public class SecondLargest3 {
	int largest = 0;
	public void second_largest_logic(int[] arr, int n) {
		int largest = arr[0], second_largest = 0;
		for(int i=0;i<=n;i++) {
			
			if(arr[i] > largest && arr[i] != largest) {
				second_largest = largest;
				largest = arr[i];
			}
			if(arr[i] > second_largest && arr[i] != largest) {
				second_largest = arr[i];
			}
		}
		
		System.out.println("largest: "+largest+"\n"+"second_largest: "+second_largest);
		this.largest = largest;
	}
	
	public void second_smallest_logic(int[] arr, int n) {
		int smallest = arr[n], second_smallest = 0;
		
		for(int i=n-1; i>=0; i--) {
			if(arr[i] < smallest && arr[i] != smallest) {
				second_smallest = smallest;
				smallest = arr[i];
			}
			if(arr[i] < second_smallest && arr[i] != smallest) second_smallest = arr[i];
		}
		System.out.println("smallest: "+smallest+"\n"+"second_smallest: "+second_smallest);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,4,7,7,5};
		int[] arr2 = {2,6,5,1,3,4};
		SecondLargest3 obj = new SecondLargest3();
		obj.second_largest_logic(arr, arr.length-1);
		obj.second_smallest_logic(arr2, arr2.length-1);
	}

}
