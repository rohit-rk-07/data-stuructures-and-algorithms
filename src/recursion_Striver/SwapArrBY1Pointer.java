package recursion_Striver;

public class SwapArrBY1Pointer {

	public void swap(int i, int[] arr) {
		
		if(i>=arr.length/2) {
			System.out.print("\nreversed array: ");
			for(int k=0;k<arr.length;k++) {
				System.out.print(arr[k]+" ");
			}
			return;
		}
		
		int temp = arr[i];
		arr[i] = arr[arr.length-i-1];
		arr[arr.length-i-1] = temp;
		
		swap(i+1, arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,1,9,9};
		System.out.print("Original array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		SwapArrBY1Pointer obj = new SwapArrBY1Pointer();
		obj.swap(0, arr);
 	}

}
 