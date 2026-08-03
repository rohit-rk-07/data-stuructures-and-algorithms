package striver_array_easy;

public class MoveZeros {
	
	public void moveZeros(int[] arr) {
		int j = -1, n = arr.length;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				j = i;
				break;
			}
		}
		
		if(j==-1) {
			return;
		}
		
		for(int i=j+1;i<n;i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		
		int[] arr1 = {0,1,0,3,12};
		int[] arr2 = {1,0,3,0,5};
		int[] arr3 = {0};
		int[] arr4 = {2,1};
		int[] arr = {4,2,4,0,0,3,0,5,1,0};
		MoveZeros obj = new MoveZeros();
		obj.moveZeros(arr);
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}

}
