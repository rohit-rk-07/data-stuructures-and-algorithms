package striver_array_easy;

public class RemoveDuplicate2 {
	
	public int removeDuplicate(int[] arr, int n) {
		int i=0;
		for(int j=1;j<n;j++) {
			if(arr[i]!=arr[j]) {
				arr[i+1] = arr[j];
				i++;
			}
		}
		
		return i+1;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,5,6};
		RemoveDuplicate2 obj = new RemoveDuplicate2();
		int k = obj.removeDuplicate(arr, arr.length);
//		System.out.println(k);
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
