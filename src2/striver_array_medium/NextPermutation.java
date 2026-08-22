package striver_array_medium;

public class NextPermutation {
	
	public int[] nextPermutation(int[] arr) {
		int n=arr.length, idx=-1;
		
		for(int i=n-2;i>0;i--) {
			if(arr[i] < arr[i+1]) {
				idx = i;
				break;
			}
			
			for(int j=n-2;j>=idx; j--) {
				if(arr[i] > arr[idx]) {
					int temp = arr[i];
					arr[i] = arr[idx];
					arr[idx] = temp;
					break;
				}
			}
			
			for(int k=idx+1;k<n-1;k++) {
				if(arr[k] > arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		
		if(idx == -1) return new int[] {-1};
		else return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,1,5,4,3,0,0};
		NextPermutation obj = new NextPermutation();
		int[] result = obj.nextPermutation(arr);
		
		for(int val:result) {
			System.out.print(val+" ");
		}
	}

}
