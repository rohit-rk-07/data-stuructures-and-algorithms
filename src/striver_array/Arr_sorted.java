package striver_array;

public class Arr_sorted {

	public boolean check_sort(int arr[], int prev_ele) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < prev_ele) return false;
			prev_ele = arr[i];
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 5, 7, 8 };
		int prev_ele = arr[0];
		Arr_sorted obj = new Arr_sorted();
		System.out.println(obj.check_sort(arr, prev_ele));
	}
}
