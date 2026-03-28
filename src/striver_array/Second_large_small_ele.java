package striver_array;

public class Second_large_small_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,7,7,2,3,4};
		int sec_large=Integer.MIN_VALUE, large=arr[0], small=arr[0], sec_small=Integer.MAX_VALUE;
		
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] > large) {
				 sec_large = large;
				 large = arr[i];
			} else if(arr[i]>sec_large && arr[i]!=large) {
				sec_large = arr[i];
			}
			
			if(arr[i] < small) {
				sec_small = small;
				small = arr[i];
			} else if(arr[i]<sec_small && arr[i]!=small) {
				sec_small = arr[i];
			}
			
		}
		
		System.out.println("sec large "+sec_large);
		System.out.println("sec small "+sec_small);
	}

}
