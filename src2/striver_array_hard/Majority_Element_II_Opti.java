package striver_array_hard;

import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II_Opti {
	
	public List<Integer> majorityElement(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int count1 = 0, count2 = 0;
		int ele1 = 0, ele2 = 0;
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			if(count1 == 0 && arr[i] != ele2) {
				count1 = 1;
				ele1 = arr[i];
			} else if(count2 == 0 && arr[i] != ele1) {
				count2 = 1;
				ele2 = arr[i];
			} else if(arr[i] == ele1) {
				count1++;
			} else if(arr[i] == ele2) {
				count2++;
			} else {
				count1--;
				count2--;
			}
		}
		
		count1 = 0; count2 = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] == ele1) count1++;
			if(arr[i] == ele2) count2++;
		}
		
		int mini = n/3+1;
		if(count1 >= mini) list.add(ele1);
		if(count2 >= mini && ele1 != ele2) list.add(ele2);
		
		return list;
	}

	public static void main(String[] args) {
		Majority_Element_II_Opti obj = new Majority_Element_II_Opti();
		int[] arr = {2,1,1,3,1,4,5,6};
		int[] arr2 = {1, 2, 1, 1, 3, 2};
		int[] arr3 = {1, 2, 1, 1, 3, 2, 2};
		List<Integer> res = obj.majorityElement(arr3);
		System.out.println(res);
	}

}
