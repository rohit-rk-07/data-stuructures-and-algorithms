package striver_array_medium;

public class Two_Sum_Problem_Opti {
	
	public int[] twoSumOpti(int[] arr, int target) {
		int i=0, j=arr.length-1;
		
		while(i<j) {
			int sum = arr[i] + arr[j];
			
			if(sum == target) {
				return new int[] {i, j};
			}
			
			if(sum<target) {
				i++;
			}
			
			if(sum > target) {
				j--;
			}
		}
		return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		int[] arr = {2,5,6,8,11};
		Two_Sum_Problem_Opti obj = new Two_Sum_Problem_Opti();
		int[] result = obj.twoSumOpti(arr, 14);
		
		for(int val:result) {
			System.out.print(val+" ");
		}
	}

}
