package striver_array;

public class Rotate_by_k_opti {
	
	public void reverse(int[] arr, int k, int n) {
		int start = k;
		int end = n;
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public int[] rotate(int[] arr, int k, int n) {
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotate_by_k_opti obj = new Rotate_by_k_opti();
		int[] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		int k = 2;
		int result[] = obj.rotate(arr, k, n);
		for(int val : result) {
			System.out.print(val+" ");
		}
	}
}