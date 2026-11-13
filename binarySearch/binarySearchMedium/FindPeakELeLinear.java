package binarySearchMedium;

public class FindPeakELeLinear {
	
	public int findPeakELe(int[] arr) {
	
		int peak = -1, n = arr.length;
		
		for(int i=1;i<n-1;i++) {
			if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) peak = arr[i];
		}
		
		return peak;
	}
	
	public int findPeakELe2(int[] arr) {
		int peak = -1, n = arr.length;
		
		for(int i=0;i<n;i++) {
			if((i==0 || arr[i-1] < arr[i]) && ((i==n-1) || arr[i] > arr[i+1])) peak = arr[i];
		}
		
		return peak;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,5,1};
		FindPeakELeLinear obj = new FindPeakELeLinear();
		int res = obj.findPeakELe2(arr);
		System.out.println(res);
	}

}
