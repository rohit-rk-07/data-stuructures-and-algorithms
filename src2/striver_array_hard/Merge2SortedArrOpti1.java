package striver_array_hard;

public class Merge2SortedArrOpti1 {

	public void merge2SortedArr(int[] arr1, int n, int[] arr2, int m) {
		int right = 0, left = n-1;
		while(left >= 0 && right < m) {
			if(arr1[left] > arr2[right]) {
				int temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
				left--;
				right++;
			} else {
				break;
			}
		}
		
		for(int val:arr1) System.out.print(val+" ");
		for(int val:arr2) System.out.print(val+" ");
	}
	
	public static void main(String[] args) {
		Merge2SortedArrOpti1 obj = new Merge2SortedArrOpti1();
		int[] arr1 = {1,3,5,7}, arr2 = {0,2,6,8,9};
		obj.merge2SortedArr(arr1, arr1.length, arr2, arr2.length);

	}

}
