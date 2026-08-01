package striver_array_easy;

public class RotateArrayByKOptimized2 {

	public void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public void leftRotate(int[] arr, int n, int k) {
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		reverse(arr, 0, n-1);
	}
	
	public void rightRotate(int[] arr, int n, int k) {
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
	}
	
	public static void main(String[] args) {
		RotateArrayByKOptimized2 obj = new RotateArrayByKOptimized2();
		int[] arr = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4,5,6};
		obj.leftRotate(arr, arr.length, 2);
		obj.rightRotate(arr2, arr2.length, 2);
		
		System.out.print("left-rotated array by 2 ---> ");
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
		System.out.print("\nright-rotated array by 2 ---> ");
		for(int val:arr2) {
			System.out.print(val+" ");
		}
	}
}

//clean right and left rotate an array by k elements, this is the optimized solution with time complexity of TC-O(2n) and SC-O(1);