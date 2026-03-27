package striver_array;

public class Largest_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,2,4,1};
		int largest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("largest: "+largest);
	}
}
