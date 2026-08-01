package striver_array_easy;

public class RotateByOne {

	public void rotateByK(int[] arr, int n) {
		int[] temp = new int[n];
		for(int i=1;i<n;i++) {
			temp[i-1] = arr[i];
		}
		temp[n-1] = arr[0];
		
		for(int val:temp) {
			System.out.print(val+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		RotateByOne obj = new RotateByOne();
		obj.rotateByK(arr, arr.length);
		
	}

}