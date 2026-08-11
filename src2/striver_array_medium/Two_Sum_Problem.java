package striver_array_medium;

import java.util.HashMap;

public class Two_Sum_Problem {

	public String twoSumReturnStr(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int expect = target-arr[i];
			if(map.containsKey(expect)) {
				return "yes";
			}
			else {
				map.put(arr[i], i);
			}
		}
		
		return "no";
	}
	
	public int[] twoSumReturnArr(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int expect = target-arr[i];
			if(map.containsKey(expect)) {
				return new int[] {map.get(expect), i};
			}
			else {
				map.put(arr[i], i);
			}
		}
		
		return new int[]{0};
	}
	
	public static void main(String[] args) {
		int[] arr = {5,2,2,6,5,8,11};
		Two_Sum_Problem obj = new Two_Sum_Problem();
		System.out.println("correct answer 1 & 2");
		int[] result = obj.twoSumReturnArr(arr, 1);
		for(int val:result) {
			System.out.print(val+" ");
		}
	}
}
