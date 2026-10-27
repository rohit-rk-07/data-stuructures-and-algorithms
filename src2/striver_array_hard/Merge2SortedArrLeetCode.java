package striver_array_hard;

public class Merge2SortedArrLeetCode {

	public void merge(int[] arr1, int n, int[] arr2, int m) {
		int read1 = n-1, read2 = m-1, write = n+m-1;
		
		while(write >= 0) {
			if(read1 >= 0 && read2 >= 0) {
				arr1[write] = arr1[read1] > arr2[read2] ? arr1[read1--] : arr2[read2--];
			} else if(read1 >= 0) {
				arr1[write] = arr1[read1--];
			} else {
				arr1[write] = arr2[read2--];
			}
			write--;
		}
	}
	
	public static void main(String[] args) {
		Merge2SortedArrLeetCode obj = new Merge2SortedArrLeetCode();
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,5,6};
		obj.merge(arr1, arr1.length, arr2, arr2.length);

		for(int val:arr1) System.out.print(val+" ");
		for(int val:arr2) System.out.print(val+" ");
	}

}
