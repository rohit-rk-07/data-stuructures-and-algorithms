package hashing_examples;
import java.util.Scanner;

public class Freq_Char2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int[] hash = new int[26];
		for(int i=0;i<s.length(); i++) {
			hash[s.charAt(i) - 'a']++;
		}
		
		int q;
		q = sc.nextInt();
		while(q-- > 0) {
			char c;
			c = sc.next().charAt(0);
			
			System.out.println(hash[c - 'a']);
		}
		
		sc.close();
	}

}
