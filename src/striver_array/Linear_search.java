package striver_array;

public class Linear_search {

	public int linear_search(int[] arr, int n, int num) {
		int i;
		for (i = 0; i < n; i++) {
			if(arr[i] == num) {
				break;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int num  = 5;
		Linear_search obj = new Linear_search();
		System.out.println("index of "+ num+": " +obj.linear_search(arr, n, num));
	}

}
