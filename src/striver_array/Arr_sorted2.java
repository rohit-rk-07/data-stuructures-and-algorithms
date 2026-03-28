package striver_array;

public class Arr_sorted2 {
	
	public boolean isSorted(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < arr[i-1]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 6, 5, 7, 8 };
		Arr_sorted2 obj = new Arr_sorted2();
		System.out.println(obj.isSorted(arr));
	}

}
