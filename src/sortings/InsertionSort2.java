package sortings;

public class InsertionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,11,13,5,6};
		int i=0, j=0, n=arr.length;
		
		for(i=0; i<=n-1; i++) {
			j=i;
			while(j>0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				
				j--;
			}
		}
		
		for(int val : arr) {
			System.out.println(val+" ");
		}
	}

}
