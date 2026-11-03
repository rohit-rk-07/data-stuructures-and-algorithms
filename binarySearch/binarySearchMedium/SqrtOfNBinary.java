package binarySearchMedium;

public class SqrtOfNBinary {

	public int sqrtOfN(int n) {
		
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(i * i <= n) ans = i;
			else break;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		SqrtOfNBinary obj = new SqrtOfNBinary();
		int res = obj.sqrtOfN(36);
		System.out.println(res);
	}

}
