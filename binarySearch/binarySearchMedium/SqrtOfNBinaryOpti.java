package binarySearchMedium;

public class SqrtOfNBinaryOpti {
	
	public int sqrtOfN(int n) {
		int ans = 0, low = 1, high = n;
		while(low <= high) {
			int mid = low + (high - low)/2;
			if((long)mid * (long)mid <= n) {
				ans = mid;
				low = mid+1;
			} else {
				high = mid - 1;
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		SqrtOfNBinaryOpti obj = new SqrtOfNBinaryOpti();
		int res = obj.sqrtOfN(2147395599);
		System.out.println(res);

	}

}
