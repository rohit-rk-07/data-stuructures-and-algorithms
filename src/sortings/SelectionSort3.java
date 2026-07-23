package sortings;

public class SelectionSort3 {

	public static void main(String[] args) {
		int arr[] = {3,4,2,9,1,5};
		int i=0, j=0, n=arr.length;
		
		for(i=0; i<n-1; i++) {
			int min = i;
			for(j=i; j<n; j++) {
				if(arr[j] < arr[min]) min = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

}
