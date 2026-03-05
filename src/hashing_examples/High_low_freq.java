package hashing_examples;

import java.util.Scanner;

public class High_low_freq {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 3, 2, 1, 3 };
		boolean[] visited = new boolean[arr.length];

		int count = 0;
		int hf = 0, lf = 0;
		boolean firstele = true;
		int hfElement = 0, lfElement = 0;

		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == false) {
				count = 1;
				visited[i] = true;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == arr[i]) {
						count++;
						visited[j] = true;
				}
			}
			if(firstele) {
				hf = count;
				lf = count;
				hfElement = arr[i];
				lfElement = arr[i];
				firstele = false;
			} else {
				if(count > hf) {
					hf = count;
					hfElement = arr[i];
				}
				if(count < lf) {
					lf = count;
					lfElement = arr[i];
				}
			}

		}

	}
		System.out.println("HFE "+hfElement+" appears "+hf+" times");
		System.out.println("LFE "+lfElement+" appears "+lf+" times");

}
}
