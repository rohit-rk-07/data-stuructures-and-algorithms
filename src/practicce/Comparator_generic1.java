package practicce;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StringLengthComparator implements Comparator<String>{
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}



public class Comparator_generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("stuvwxyz","lmnopqr","ghijk","abc","def");
		words.sort(new StringLengthComparator());
		System.out.println(words);
	}

}
