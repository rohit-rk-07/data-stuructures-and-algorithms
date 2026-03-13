package sortings;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13,46,24,52,20,9};
		for(int i = arr.length-1; i>=0; i-- ) {
			for(int j=0;j<i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}
}
