package recursion_Striver;

public class SwapArr {
	
	public void swap(int l, int r, int arr[]) {
		
		if(l>r){ 
			for(int i=0;i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			return;
		}
		
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		
		swap(l+1, r-1, arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapArr obj = new SwapArr();
		int arr[] = {2,2,1,5,5};
		System.out.print("original array: ");
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nreversed array: ");
		obj.swap(0, arr.length-1, arr);
	}

}
