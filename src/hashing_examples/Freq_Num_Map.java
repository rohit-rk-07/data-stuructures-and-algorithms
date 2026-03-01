package hashing_examples;

import java.util.HashMap;
import java.util.Scanner;

public class Freq_Num_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0;i<n;i++) {
			int key = arr[i];
			int freq = 0;
			if(mp.containsKey(key)) { 
				freq = mp.get(key);
			}
			freq++;
			mp.put(key, freq);
		}
		
		int q = in.nextInt();
		while(q-- > 0) {
			int number = in.nextInt();
			
			if(mp.containsKey(number))
				System.out.println(mp.get(number));
			else 
				System.out.println(0);
		}
	}

}
