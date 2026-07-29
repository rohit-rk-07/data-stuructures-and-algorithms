package striver_array_easy;

public class SecLar_SecSml {
	
	public void sort(int[] arr, int n) {
		
		for(int i=n-1;i>=1;i--) {
			for(int j=0;j<=i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public int second_lar_smll(int[] arr, int n) {
		int largest = arr[n-1];
		int sec_large = 0;
		for(int i=n-2; i>=0; i--) {
			if(arr[i] != largest) sec_large = arr[i]; 
			break;
		}
		return sec_large;
	}

	public static void main(String[] args) {
		int arr[] = {2,5,3,9,6,2};
		SecLar_SecSml obj = new SecLar_SecSml();
		obj.sort(arr, arr.length);
		
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
		int val = obj.second_lar_smll(arr, arr.length);
		System.out.println("------------------------->"+val);
	}

}
