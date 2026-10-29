package binarySearchMedium;

public class FirstNLastPositionOfEle {
	
	public int[] firstNLast(int[] arr, int x) {
		
		int first = -1, last = -1, n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i] == x) {
				if(first == -1) {
					first = i;
				} else {
					last = i;
				}
			}
		}
		
		return new int[] {first, last};
	}

	public static void main(String[] args) {
		FirstNLastPositionOfEle obj = new FirstNLastPositionOfEle();
//		int[] arr = {2,4,6,11,13};
		int[] arr = {5,7,7,8,8,10};
		obj.firstNLast(arr, 8);

	}

}
