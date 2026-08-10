package striver_array_easy;

public class LongestSubArrSumK2 {

	public int longSubArr(int[] arr, int k) {
		int maxLen = 0, sum = 0, i = 0, j = 0, n = arr.length;

		while (j < n) {
			//here the sum is increased on every iteration
			sum += arr[j];
			
			//here we're decreasing the sum and shrinking the window size
			if (sum > k) {
				while (sum > k) {
					sum -= arr[i];
					i++;
				}
			}

			//checking if the sum == k and updating the maxLen
			if (sum == k) {
				maxLen = Math.max(maxLen, j - i + 1);
			}

			j++;
		}
		return maxLen;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 1, 1, 2, 3, 5 };
		int[] arr2 = {1,2,3};
		LongestSubArrSumK2 obj = new LongestSubArrSumK2();
		System.out.println(obj.longSubArr(arr2, 3));
	}
}
