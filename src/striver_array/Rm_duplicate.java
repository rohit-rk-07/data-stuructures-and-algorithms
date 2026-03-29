package striver_array;

public class Rm_duplicate {
	
	public void remove_duplicate(int[] arr) {
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				arr[i+1] = arr[j];
				i++;
			}
		}

		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rm_duplicate obj = new Rm_duplicate();
		int arr[] = {1,1,2,2,3,3,3,4};
		obj.remove_duplicate(arr);
	}
}
