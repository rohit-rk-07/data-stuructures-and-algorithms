package striver_array_hard;

public class Merge2SortedArr {
	
	public void mergeArrs(int[] arr1, int n, int[] arr2, int m) {
		int[] arr3 = new int[n+m];
		int left = 0, right = 0, index = 0;
		
		while(right < m && left < n) {
			if(arr1[left] < arr2[right]) {
				arr3[index] = arr1[left];
				left++;
				index++;
			} else {
				arr3[index] = arr2[right];
				right++;
				index++;
			}
		}
		while(left < n) arr3[index++] = arr1[left++];
		while(right < m) arr3[index++] = arr2[right++];
		
		for(int i=0;i<n+m;i++) {
			if(i<n) arr1[i] = arr3[i];
			else arr2[i-n] = arr3[i];
		}
	}

	public static void main(String[] args) {
		Merge2SortedArr obj = new Merge2SortedArr();
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {0, 2, 6, 8, 9};
		obj.mergeArrs(arr1, arr1.length, arr2, arr2.length);
	}
	
}
