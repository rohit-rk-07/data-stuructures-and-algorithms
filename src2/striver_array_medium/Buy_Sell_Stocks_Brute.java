package striver_array_medium;

public class Buy_Sell_Stocks_Brute {
	
	public int buyNsell(int[] arr) {
		int max=0, min=0, n=arr.length;
		
		for(int i=0;i<n;i++) {
			int j = i;
			while(j > 0) {
				max = Math.max(max, arr[i] - arr[i-1]);
				
				j--;
			}
		}
		
		return max;
	}

	public int buyNsellStock(int[] arr) {
		
		int n=arr.length, min=arr[0], max_profit=0;
		
		for(int i=0;i<n;i++) {
			int j=i;
			
			while(j>0) {
				min = Math.min(min, arr[j]);
				j--;
			}
			int max = arr[i] - min;
			max_profit = Math.max(max_profit, max);
		}
		
		return max_profit;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int[] arr2 = {7,6,4,3,1};
		Buy_Sell_Stocks_Brute obj = new Buy_Sell_Stocks_Brute();
		System.out.println(obj.buyNsellStock(arr2));

	}

}
