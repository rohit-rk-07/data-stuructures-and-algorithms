package striver_array_medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {
	
	public int longestConseSeq(int[] arr) {
		int count=0, n=arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			map.put(i, arr[i]);
			System.out.println(i+" "+arr[i]);
		}
		
		for(int i=0;i<n-1;i++) {
			int target = Math.abs(arr[i]-arr[i+1]);
			if(map.containsValue(target)) {
				count++;
			}
		}
		
		return count+1;
	}

	public int longConsecSel(int[] arr) {
		int n=arr.length, count=1, longest=0;
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(arr[i]);
		}
		
		for(int i=0;i<n;i++) {
			int pre=arr[i]-1;
			int post=arr[i]+1;
			
			if(set.contains(pre)) {
				continue;
			}
			
			if(set.contains(post)) {
				int j=0;
				count++;
				while(set.contains(post+j)){
					count++;
					j++;
					longest=count;
				}
			}
		}
		
		return longest;
	}
	
	public int longestConsecutiveSequence(int[] arr) {
		int n=arr.length, longest=0;
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(arr[i]);
		}
		
		for(int i=0;i<n;i++) {
			if(set.contains(arr[i]-1)) {
				continue;
			} else {
				int j=1;
				int count = 1;
				while(j<=n) {
					if(set.contains(arr[i]+j)) {
						count++;
					} else {
						break;
					}
					j++;
				}
				longest = Math.max(longest, count);
			}
		}
		return longest;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,3,7,2,5,8,4,6,0,1};
		int[] arr2 = {100,4,200,1,3,2};
		LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
		System.out.println(obj.longestConsecutiveSequence(arr2));
	}

}
