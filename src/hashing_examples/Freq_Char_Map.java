package hashing_examples;
import java.util.Scanner;
import java.util.HashMap;

public class Freq_Char_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int n = str.length();
		
		char[] CharArr = new char[n];
		for(int i=0;i<n;i++) {
			CharArr[i] = str.charAt(i);
//			System.out.print(CharArr[i]+", ");
		}
		
		HashMap<Character, Integer> charHM = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			char key = CharArr[i];
			int freq = 0;
			if(charHM.containsKey(key)) freq = charHM.get(key);
			freq++;
			charHM.put(key, freq);
		}
		
		System.out.print("enter the queries number: ");
		int query = in.nextInt();
		while(query-- > 0) {
			System.out.print("enter the char to search freq: ");
			char ch = in.next().charAt(0);
			if(charHM.containsKey(ch)) System.out.println(charHM.get(ch));
			else System.out.println(0);
		}
		
		
	}

}
