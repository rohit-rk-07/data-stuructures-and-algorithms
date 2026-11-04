package binarySearchMedium;

public class SmallestDeviser {
	
	public int sumOfD(int[] arr, int div) {
		double sum = 0; 
		int n = arr.length;
		for(int i=0;i<n;i++) {
			sum = sum + Math.ceil((double) arr[i]/(double)(div));
		}
		return (int)sum;
	}
	
	public int findSmallestDiv(int arr[], int div) {
		int ans=-1, low = 1, high = arr.length-1, i=0;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(sumOfD(arr, mid)<= div) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return low;
	}

	public static void main(String[] args) {
		SmallestDeviser obj = new SmallestDeviser();
		int[] arr = {1, 2, 5, 9};
		int res = obj.findSmallestDiv(arr, 7);
		System.out.println(res);
	}

}
