package striver_array;

public class Rotate_by_k {
	
	public void rotate_by_k(int[] arr, int k, int n) {
		int temp[] = new int[k];
		for(int i=0;i<k;i++) {
			temp[i] = arr[n-i];
			System.out.print(temp[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotate_by_k obj = new Rotate_by_k();
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length-1;
		obj.rotate_by_k(arr, 2, n);
	}

}
