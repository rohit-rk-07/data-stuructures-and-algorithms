package striver_array_easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public int removeDuplicate2(int[] arr) {
		Set<Integer> set = new HashSet<>();
		
		int index = 0;
		for(int num:arr) {
			if(!set.contains(num)) {
				set.add(num);
				arr[index] = num;
				index++;
			}
			
		}
		return index;
		
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
		RemoveDuplicate rm = new RemoveDuplicate();
		int k = rm.removeDuplicate2(arr);
		
		System.out.println(k);
			
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
