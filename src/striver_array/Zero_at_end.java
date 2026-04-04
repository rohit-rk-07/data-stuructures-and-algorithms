package striver_array;

public class Zero_at_end {

	public void move_zeros(int[] arr, int n) {
		int temp[] = new int[n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				temp[index] = arr[i];
				index++;
			}
		}
		for(int i=0;i<n;i++) {
			arr[i] = temp[i];
		}
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zero_at_end obj = new Zero_at_end();
		int arr[] = { 1, 3, 0, 0, 4, 0, 5};
		int n = arr.length;
		obj.move_zeros(arr, n);
	}

}
