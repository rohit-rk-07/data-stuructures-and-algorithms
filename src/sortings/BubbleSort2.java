package sortings;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,6,1,3};
		int n = arr.length;
		
		for(int i=n-1; i>=1; i--) {
			for(int j=0; j<=i-1; j++) {
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
