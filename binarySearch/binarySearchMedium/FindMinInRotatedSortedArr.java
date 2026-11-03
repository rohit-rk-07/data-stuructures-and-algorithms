package binarySearchMedium;

public class FindMinInRotatedSortedArr {
	
	public int findMin(int[] arr) {
        int ans = Integer.MAX_VALUE;
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
                
            } else {
            	high = mid - 1;
                ans = Math.min(ans, arr[mid]);
                
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		FindMinInRotatedSortedArr obj = new FindMinInRotatedSortedArr();
		int[] arr = {4,5,6,7,0,1,2};
		int res = obj.findMin(arr);
		System.out.println(res);
	}

}
