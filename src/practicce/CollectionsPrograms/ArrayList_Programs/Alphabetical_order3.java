package practicce.CollectionsPrograms.ArrayList_Programs;

import java.util.ArrayList;

public class Alphabetical_order3 {

	public static int compareStrings(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		int minLen = Math.min(len1, len2);
		
		for(int i=0;i<minLen;i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			if(c1 != c2) {  //Difference of ASCII values
				return c1-c2;
			}
		}
		
	return len1-len2;   //If all matched, shorter string is "smaller"	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("orange");
		
		System.out.println(fruits);
		
		for(int i=0;i<fruits.size()-1;i++) {
			for(int j=0;j<fruits.size()-i-1;j++) {
				if(compareStrings(fruits.get(j), fruits.get(j+1))>0) {
					String temp = fruits.get(j);
					fruits.set(j, fruits.get(j+1));
					fruits.set(j+1, temp);
				}
			}
		}
		System.out.println(fruits);
	}

}
