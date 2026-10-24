package striver_array_hard;

public class Merge2SortedArrOpti2 {
	
	protected void swapIfGreater(int arr1[], int arr2[], int ind1, int ind2) {
		if(arr1[ind1] > arr2[ind2]) {
			int temp = arr1[ind1];
			arr1[ind1] = arr2[ind2];
			arr2[ind2] = temp;
		}
	}
	
	public void mergeArr(int[] arr1, int n, int[] arr2, int m) {
		int len = m + n;
		int gap = (len / 2) + (len % 2);
		
		while(gap >= 1) {
			int left  = 0;
			int right = left + gap;
			
			while(right < len) {
				//arr1 and arr2
				if(left < n && right >= n) {
					swapIfGreater(arr1, arr2, left, right - n);
				}
				//arr2 and arr2
				else if(left >= n) {
					swapIfGreater(arr2, arr2, left - n, right - n);
				} 
				//arr1 and arr1
				else {
					swapIfGreater(arr1, arr1, left, right);
				}
				left++; right++;
			}
			if(gap == 1) return;
			gap = (gap / 2) + (gap % 2);
		}
	}

	public static void main(String[] args) {
		Merge2SortedArrOpti2 obj = new Merge2SortedArrOpti2();
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {0,2,6,8,9};
		obj.mergeArr(arr1, arr1.length, arr2, arr2.length);
		for(int val:arr1) System.out.print(val+" ");
		for(int val:arr2) System.out.print(val+" ");
	}

}
