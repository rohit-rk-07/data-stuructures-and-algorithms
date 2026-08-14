package striver_array_medium;

public class Max_Sub_Arr_Sum_Kadanes_Algo_Opti {
	
	public int[] subArr(int[] arr) {
		int sum=-1, maxLen=-1, startAns=0, endAns=0, n=arr.length, start=0;
		
		for(int i=0;i<n;i++) {
			// this (start) stores the index value from where the sub-array starts
			if(sum == 0) start=i;
			
			//calculation of sum here
			sum += arr[i];
			
			// here when the sum starts to compound, its being stored in maxLen
			// startAns variable stores the start of the sub-arr which was initialized from above 13 Line
			// endAns variable stores the index of last sum which greater than maxLen
			if(sum > maxLen) {
				maxLen = sum;
				startAns=start;
				endAns = i;
			}
			
			//while compounding the sum if it reduces to less than 0, then it is initialized to 0 again
			else if(sum < 0) sum=0;
			
		}
		
		return new int[] {startAns, endAns};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		int[] arr2 = {-2,1,-3,4,-1,2,1,-5,4};
		Max_Sub_Arr_Sum_Kadanes_Algo_Opti obj = new Max_Sub_Arr_Sum_Kadanes_Algo_Opti();
		int[] res = obj.subArr(arr2);
		
		//printing the index's
		for(int val:res) {
			System.out.print(val+" ");
		}
		
		System.out.println("\n");
		
		//printing the index of values
		for(int i=res[0]; i<res[1];i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
