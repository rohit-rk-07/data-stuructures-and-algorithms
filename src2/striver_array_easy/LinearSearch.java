package striver_array_easy;

public class LinearSearch {

	public int linearSearch(int[] arr, int num) {
		int n = arr.length, i = 0;
		for(i=0;i<n;i++) {
			if(arr[i] == num) break;
		}
		return i;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		LinearSearch obj = new LinearSearch();
		System.out.print(obj.linearSearch(arr, 4));
	}

}
