package striver_array_medium;

public class Reverse_count_pairs {
	
	public int count_rev_pairs(int[] arr, int n) {
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > 2 * arr[j]) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		Reverse_count_pairs obj = new Reverse_count_pairs();
		int[] arr = {10, 5, 2, 6, 1, 8, 3, -2};
		int[] arr2 = {-5, -5, -3, -2};
		int[] arr3 = {40, 25, 19, 12, 9, 6, 2};
		int res = obj.count_rev_pairs(arr3, arr3.length);
		System.out.println(res);
	}

}
