package binarySearchMedium;

public class FirstNLastPositionOfEleOpti {

	    public int firstOccur(int[] arr, int x) {
	        int low = 0, high = arr.length - 1;
	        int first = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] >= x) {
	                if (arr[mid] == x) {
	                    first = mid;
	                }
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	            }
	        }

	        return first;
	    }

	    public int lastOccur(int[] arr, int x) {
	        int low = 0, high = arr.length - 1;
	        int last = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] <= x) {
	                if (arr[mid] == x) {
	                    last = mid;
	                }
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return last;
	    }

	    public int[] searchRange(int[] arr, int x) {
	        int first = firstOccur(arr, x);

	        if (first == -1) {
	            return new int[]{-1, -1};
	        }

	        int last = lastOccur(arr, x);

	        return new int[]{first, last};
	    }

	public static void main(String[] args) {
		FirstNLastPositionOfEleOpti obj = new FirstNLastPositionOfEleOpti();
		int[] arr = {5,7,7,8,8,10};
		int[] res = obj.searchRange(arr, 8);
		
		for(int val:res) {
			System.out.print(val+" ");
		}
	}

}
