package striver_array_easy;

import java.util.HashMap;
import java.util.Map;

public class Appear_once {
	
	//Brute force TC: O(N^2) 
	//iterating & comparing single element with all elements in the array
	public int appear_once1(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int num=arr[i], cnt=0;
			for(int j=0;j<n;j++) {
				if(arr[j] == num) cnt++;
			}
			if(cnt == 1) return num;
		}
		return -1;
	}
	
	//Better approach TC: O(N log M) 
	//using a map data structure 
	public int appear_once2(int[] arr) {
		int singleNum = 0, n=arr.length, val=1;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++) {
        	if(map.containsKey(arr[i])) {
        		map.put(arr[i], map.get(arr[i])+1);
        	}
        	else {
        		map.put(arr[i], 1);
        	}
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if(entry.getValue() == 1) {
        		return entry.getKey();
        	}
        }
        return -1;
	}
	
	//optimal approach
	public int appear_once3(int[] arr) {
		int XOR = 0 ,n=arr.length;
		
		for(int i=0;i<n;i++) {
			XOR ^= arr[i];
		}
		
		return XOR;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,4,5,5,6};
		Appear_once obj = new Appear_once();
		System.out.println(obj.appear_once3(arr));

	}

}
