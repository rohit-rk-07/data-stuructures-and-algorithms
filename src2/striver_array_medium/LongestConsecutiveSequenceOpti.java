package striver_array_medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceOpti {
	
	public int longestConsecutive(int[] arr) {
		int n=arr.length, longest=1;
		if(n==0) return 0;
		
		Set<Integer> st = new HashSet<>();
		for(int i=0;i<n;i++) {
			st.add(arr[i]);
		}
		
		for(int it:st) {
			if(!st.contains(it-1)) {
				int x=it;
				int cnt=1;
				while(st.contains(x+1)) {
					x=x+1;
					cnt=cnt+1;
				}
				longest = Math.max(longest, cnt);
			}
		}
		
		return longest;
	}

	public static void main(String[] args) {
		int[] arr1 = {100,4,200,1,3,2};
		int[] arr2 = {0,3,7,2,5,8,4,6,0,1};
		int[] arr3 = {1,0,1,2};
		LongestConsecutiveSequenceOpti obj = new LongestConsecutiveSequenceOpti();
		System.out.println(obj.longestConsecutive(arr3));

	}

}
