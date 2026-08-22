package striver_array_medium;

public class RearrangeBySign {
	
	public int[] arrangeBySign(int[] arr) {
		int n=arr.length;
		int[] result = new int[n]; 
		
		for(int i=0;i<n;i++) {
			if(arr[i]>0 && i%2==0) {
				result[i]=arr[i];
			} else {
				result[i]=arr[i];
			}
		}
		
		return result;
	}
	
	public int[] arrangeBySignOpti(int[] arr) {
		int n=arr.length;
		int[] ans=new int[n];
		int posIdx=0, negIdx=1;
		
		for(int i=0;i<n;i++) {
			if(arr[i] < 0) {
				ans[negIdx] = arr[i];
				negIdx += 2;
			} else {
				ans[posIdx] = arr[i];
				posIdx += 2;}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {3,1,-2, -5,2,-4};
		RearrangeBySign obj = new RearrangeBySign();
		int[] result = obj.arrangeBySignOpti(arr);

		for(int val:result) {
			System.out.print(val+" ");
		}
	}

}
