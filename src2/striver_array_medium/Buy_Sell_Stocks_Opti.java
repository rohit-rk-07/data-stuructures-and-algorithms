package striver_array_medium;

public class Buy_Sell_Stocks_Opti {
	
	public int buySellStock(int[] arr) {
		
		int n=arr.length, mini=arr[0], profit=0;
		
		for(int i=1;i<n;i++) {
			int cost = arr[i]-mini;
			profit = Math.max(profit, cost);
			mini = Math.min(mini, arr[i]);
		}
		
		return profit;
	}

	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int[] arr2 = {7,6,3,2,1};
		Buy_Sell_Stocks_Opti obj = new Buy_Sell_Stocks_Opti();
		System.out.println(obj.buySellStock(arr2));
	}

}
