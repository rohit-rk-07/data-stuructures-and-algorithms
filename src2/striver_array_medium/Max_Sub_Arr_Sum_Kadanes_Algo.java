package striver_array_medium;

public class Max_Sub_Arr_Sum_Kadanes_Algo {
	
	public int maxSubArr(int[] arr) {
		int sum = 0, maxLen = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(sum>0 || arr[i]>0) {
				sum += arr[i];
				maxLen = Math.max(maxLen, sum);
			}
		}
		
		if(maxLen>0) return maxLen;
		else return -1;
	}
	
	public int maxSubArr2(int[] arr) {
		int sum=0, maxLen=0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			
			if(sum > maxLen) {
				maxLen = sum;
			}
			
			if(sum < 0) {
				sum = 0;
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		Max_Sub_Arr_Sum_Kadanes_Algo obj = new Max_Sub_Arr_Sum_Kadanes_Algo();
		
		System.out.println(obj.maxSubArr2(arr));
	}

}
