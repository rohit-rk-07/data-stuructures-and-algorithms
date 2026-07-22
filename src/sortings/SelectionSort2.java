package sortings;

public class SelectionSort2 {
	public static void main(String[] args) {
		
		int[] arr = {23,12,45,6,78,1};
		int n = arr.length;
		int i=0, j=0;
		
		for(i=0; i<=n-2; i++) {
			int min = i;
			for(j=i; j<=n-1; j++) {
				if(arr[j] < arr[min]) min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int val : arr) {
			System.out.print(" "+val);
		}
		
	}
}
