package hashing_examples;

import java.util.Scanner;

public class Freq_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		char ch = 'c';
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) count++;
		}
		System.out.println(count+" times");
	}

}
