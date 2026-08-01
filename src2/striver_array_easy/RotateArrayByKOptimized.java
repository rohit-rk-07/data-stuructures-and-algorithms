package striver_array_easy;

public class RotateArrayByKOptimized {
	
	public void leftRotateByK(int[] arr, int n, int k) {
		//reverse the portions of array
		int start = n;
		int end = k;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		RotateArrayByKOptimized obj = new RotateArrayByKOptimized();
		int[] arr = {1,2,3,4,5,6};
		int k = 2;
		
		//right rotate
		obj.leftRotateByK(arr, 0, arr.length-1);
		obj.leftRotateByK(arr, 0, k-1);
		obj.leftRotateByK(arr, k, arr.length-1);
		 
		//left rotate
//		obj.leftRotateByK(arr, 0, k-1);
//		obj.leftRotateByK(arr, k, arr.length-1);
//		obj.leftRotateByK(arr, 0, arr.length-1);
		
		
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}
}
