package striver_array;

import java.util.Arrays;

public class Rotate_by_k {
	
	public void rotate_by_k(int[] arr, int k, int n) {
		int temp[] = Arrays.copyOfRange(arr, n-k, n);
		k = k%n;
		
		for(int i=n-k-1;i>=0;i--) {
			arr[i+k] = arr[i];
		}
		
		for(int i=0;i<k;i++) {
			arr[i] = temp[i];
		}
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}
	
	public void rotate_by_k_left(int[] arr, int k, int n) {
		int temp[] = Arrays.copyOfRange(arr, 0, k);
//		n = arr.length-1;
		for(int i=0;i<n-k;i++) {
			arr[i] = arr[i+k];
		}
		for(int i=n-k;i<n;i++) {
			arr[i] = temp[i-(n-k)];
		}
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotate_by_k obj = new Rotate_by_k();
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
//		obj.rotate_by_k(arr, 2, n);
		obj.rotate_by_k_left(arr, 2, n);
	}

}
