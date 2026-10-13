package striver_array_hard;

public class Count_Inversion_Brute {
	
	public int countInversion(int[] arr) {
		int count = 0, n = arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] > arr[j]) {
					count +=1;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Count_Inversion_Brute obj = new Count_Inversion_Brute();
		int[] arr = {5,4,2,1,3};
		int res = obj.countInversion(arr);
		System.out.println(res);
	}

}
