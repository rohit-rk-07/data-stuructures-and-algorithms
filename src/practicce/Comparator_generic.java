package practicce;
import java.util.List;
import java.util.ArrayList;
public class Comparator_generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(7);
		intList.add(1);
		intList.add(0);
		
		intList.sort(null);
//		System.out.println(intList);
		
		List<String> words = new ArrayList<>();
		words.add("Coconut");
		words.add("Grapes");
		words.add("Mango");
		words.add("Banana");
		words.add("Apple");
		
		words.sort(null);
		System.out.println(words);
	}

}
