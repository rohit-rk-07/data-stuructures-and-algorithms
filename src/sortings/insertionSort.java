package sortings;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,5,4,3,2,1};
		for(int i=0;i<=arr.length-1;i++) {
			int j = i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

}
