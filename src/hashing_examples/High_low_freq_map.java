package hashing_examples;

import java.util.HashMap;

public class High_low_freq_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,2,3,2,1,3};
		int count = 0;
		int hf = 0, lf = 0;
		int hfEle = 0, lfEle = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!hm.containsKey(arr[i])) {
				int key = arr[i];
				int freq = 0;
				hm.put(key, freq);
				if(hm.containsKey(arr[i])) {
					count++;
					freq++;
					hm.put(key, freq);
				}
				lf = count;
				hf = count;
			}
			if(count > hf) {
				hf = count;
				hfEle = arr[i];
			}
			if(count < lf) {
				lf = count;
				lfEle = arr[i];
			}
			
		}
		System.out.println("hfEle "+hfEle+" times "+hf);
		System.out.println("lfEle "+lfEle+" times "+lf);
	}

}
