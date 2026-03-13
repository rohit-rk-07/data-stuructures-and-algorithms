package hashing_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class High_low_freq_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 1, 2, 3, 2, 3 };

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int key = 0, freq = 0;
			if (hm.containsKey(arr[i])) {
				freq = hm.get(arr[i]);
				freq++;
				key = arr[i];
				hm.put(key, freq);
			} else {
				freq = 1;
				key = arr[i];
				hm.put(key, freq);
			}
			
		}
		
		Set<Map.Entry<Integer, Integer>> set = hm.entrySet();

		boolean first = true;
		int hf = 0, lf = 0;
		int hfEle = 0, lfEle = 0;

		for (Map.Entry<Integer, Integer> mp : set) {
		    int element = mp.getKey();
		    int frequency = mp.getValue();
		    
		    if (first) {
		        hf = frequency;
		        lf = frequency;
		        hfEle = element;
		        lfEle = element;
		        first = false;
		    } else {
		        if (frequency > hf) {
		            hf = frequency;
		            hfEle = element;
		        }
		        if (frequency < lf) {
		            lf = frequency;
		            lfEle = element;
		        }
		    }
		}

		System.out.println("Highest frequency element: " + hfEle + " appears " + hf + " times");
		System.out.println("Lowest frequency element: " + lfEle + " appears " + lf + " times");
	}

}