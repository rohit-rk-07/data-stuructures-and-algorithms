package striver_array_medium;

public class Sort_0s_1s_2s {
	
	public void sortZerosOnesTwos(int[] arr) {
		int n=arr.length, low=0, mid=0, high=n-1;
		
		while(mid<=high) {
			if(arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}
			
			else if(arr[mid] == 1) {
				mid++;
			}
			
			else if(arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {0,1,1,0,1,2,1,2,0,0,0};
		
		Sort_0s_1s_2s obj = new Sort_0s_1s_2s();
		obj.sortZerosOnesTwos(arr);
		
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}
}
