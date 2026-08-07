package striver_array_easy;

public class Max_Consecutine_Ones {
	
	public int max_ones(int[] arr) {
		int max = 0, count = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==0) {
				max = count;
				count = 0;
			}
			count++;
		}
		return max;
	}
	
	public int max_ones2(int[] arr) {
		int max = 0, count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			} else {
				count = 0;
			}
			
			max = Math.max(max, count);
		}
		
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,0,1,1,1,0,1,1};
		int[] arr2 = {0,1};
		Max_Consecutine_Ones obj = new Max_Consecutine_Ones();
		System.out.print(obj.max_ones2(arr));
	}

}
