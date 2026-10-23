package striver_array_hard;

public class Maximum_product_subArr_Opti {
	
	public int maxPrdtSubArr(int[] arr, int n) {
		
		int ans = Integer.MIN_VALUE, prefix = 1, suffix = 1;
		for(int i=0;i<n;i++) {
			if(prefix == 0) prefix = 1;
			if(suffix == 0) suffix = 1;
			
			prefix *= arr[i];
			suffix *= arr[n-i-1];
			ans = Math.max(ans, Math.max(prefix, suffix));
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Maximum_product_subArr_Opti obj = new Maximum_product_subArr_Opti();
		int[] arr = {2, 3, -2, 4};
		int[] arr2 = {-2, 3, 4, -1, 0, -2, 3, 1, 4, 0, 4, 6, -1, 4};
		int res = obj.maxPrdtSubArr(arr2, arr2.length);
		System.out.println(res);
	}

}
