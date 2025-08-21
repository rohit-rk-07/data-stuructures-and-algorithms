package practicce;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StringLengthComparator implements Comparator<String>{
	public int compare(String o1, String o2) {
		return 0;
	}
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1 - o2;
	}
	
}



public class Comparator_generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(7);
		intList.add(1);
		intList.add(0);
		
		intList.sort(new MyComparator());
		System.out.println(intList);
		
		List<String> words = Arrays.asList("stuvwxyz","lmnopqr","ghijk","def","abc");
//		words.add("stuvwxyz");
//		words.add("lmnopqr");
//		words.add("ghijk");
//		words.add("def");
//		words.add("abc");
		
//		words.sort(new StringLengthComparator());
//		System.out.println(words);
	}

}
