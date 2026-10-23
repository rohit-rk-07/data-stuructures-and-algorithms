package striver_array_hard;

public class Maximum_product_subArr {
	
	public int maxProduct(int[] arr, int n) {
		int max_product = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<i+2;j++) {
				int product = arr[i] * arr[j];
				if(product > max_product) max_product = product;
			}
		}
		
		return max_product;
	}
	
	public int maxProduct2(int[] arr, int n) {
		int maxi = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			int product = 1;
			for(int j=i;j<n;j++) {
				product *= arr[j];
				maxi = Math.max(maxi, product);
			}
		}
		
		return maxi;
	}

	public static void main(String[] args) {
		Maximum_product_subArr obj = new Maximum_product_subArr();
		int[] arr = {2, 3, 2, 4, 1};
		int res = obj.maxProduct(arr, arr.length-1);
		System.out.println(res);
	}

}
