package striver_array_easy;

public class RotateByK {
	
	public void LeftRotateByK(int[] arr, int n, int d) {
		int[] temp = new int[d];
		for(int i=0;i<n-d-1;i++) {
			temp[i]=arr[i];
		}

		for(int i=d;i<n;i++) {
			arr[i-d] = arr[i];
		}
		
		for(int i=n-d;i<n;i++) {
			arr[i] = temp[i-(n-d)];
		}
		
	}
	
	public void RightRotateByK(int arr[], int n, int k) {
		int[] temp = new int[k];
		
		for(int i=0;i<k;i++) {
			temp[i] = arr[n-k+i];
		}
		
		for(int i=n-k-1;i>=0;i--) {
			arr[i+k] = arr[i];
		}
		
		for(int i=0;i<temp.length;i++) {
			arr[i] = temp[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		RotateByK obj = new RotateByK();
		obj.RightRotateByK(arr, arr.length, 2);

		for(int val:arr) {
			System.out.print(val+" ");
		}
	}

}


