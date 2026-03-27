package striver_array;

public class Second_large_small_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,2,5,5,1,7,8};
		int sec_large=0, large=arr[0], small=arr[0], sec_small=0;
		
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1] > large) {
				 sec_large = large;
				 large = arr[i+1];
			}
			if(arr[i+1] < small) {
				sec_small = small;
				small = arr[i+1];
			}
			
		}
		
		System.out.println("sec large "+sec_large);
		System.out.println("sec small "+sec_small);
	}

}
