package striver_array_easy;

public class LongestSubArrSumK {
	
	public void subArr(int[] arr, int n, int k) {
		int len = 0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum += arr[j];
				
				if(sum == k) len=Math.max(len, j-i+1);
				if(sum > k) break;
			}
		}
		System.out.println(len);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,1,1,1,4,2,3};
		LongestSubArrSumK obj = new LongestSubArrSumK();
		obj.subArr(arr, arr.length, 3);
	}

}
