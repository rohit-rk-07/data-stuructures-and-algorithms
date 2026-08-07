package striver_array_easy;

public class MissingElement {
	
	public int missingOne(int[] arr) {
		int n = arr.length+1;
		int sum = 0;
		for(int i=0;i<n-1;i++) {
			sum += arr[i];
		}
		
		int expSum = n*(n+1)/2;
		
		return (expSum - sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,2,4,5,3,7,1};
		MissingElement obj = new MissingElement();
		System.out.println(obj.missingOne(arr));
	} 
}
