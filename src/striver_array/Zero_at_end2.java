package striver_array;

public class Zero_at_end2 {

	public void zero_at_end(int[] arr, int n) {
		int j = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}

		for (int i = j + 1; i < n; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zero_at_end2 obj = new Zero_at_end2();
		int[] arr = { 1, 3, 0, 0, 4, 0, 5 };
		int n = arr.length;
		obj.zero_at_end(arr, n);
	}

}
