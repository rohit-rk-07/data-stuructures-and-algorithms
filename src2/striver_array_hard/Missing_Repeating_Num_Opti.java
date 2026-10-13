package striver_array_hard;

public class Missing_Repeating_Num_Opti {
	
	public int[] find_numbers(int[] arr) {
		int n=arr.length;
		long actualSum = 0;
		long actualSqrSum = 0;
		
		for(long val:arr) {
			actualSum += val;
			actualSqrSum += val*val;
		}
		
		long expectedSum = n*(n+1)/2;
		long expectedSqrSum = n*(n+1)*(2*n+1)/6;
		long difference = actualSum - expectedSum;
		long sumOfAns = (actualSqrSum-expectedSqrSum) / difference;
		
		long repeating = (difference + sumOfAns) / 2;
		long missing = repeating - difference;
		
		return new int[] {(int)repeating, (int)missing};
	}

	public static void main(String[] args) {
		Missing_Repeating_Num_Opti obj = new Missing_Repeating_Num_Opti();
		int[] arr = {4,3,1,1,2,6};
		int[] res = obj.find_numbers(arr);
		for(int val:res) {
			System.out.println(val);
		}
	}

}
