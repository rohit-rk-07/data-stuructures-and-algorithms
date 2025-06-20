package practicce;

public class Reverse_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rev_arr= {6,5,4,3,2,1};
		
		//reverse using two-pointer approach
		int start = 0;
		int end = rev_arr.length-1;
		
		while(start<end) {
			//swap elements
			int temp = rev_arr[start];
			rev_arr[start]=rev_arr[end];
			rev_arr[end]=temp;
			
			start++;
			end--;
		}
		
		//print reversed array
		for(int i:rev_arr) {
			System.out.print(i+" ");
		}
	}

}
