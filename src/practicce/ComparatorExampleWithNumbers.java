package practicce;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class MyComparator1 implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2) {
//		return o1 - o2;
		int res = o1 - o2;
		System.out.println("compare(" + o1 + ", " + o2 + ") -> " + res);
        return res;
	}
}

public class ComparatorExampleWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lists = new ArrayList<>();
		lists.add(5);
		lists.add(7);
		lists.add(6);
		lists.add(4);
		lists.add(3);
		
		
//		MyComparator1 comp = new MyComparator1();
//		MyComparator1 comp2 = new MyComparator1();
//		lists.sort(comp);
//		lists.sort(comp2);
		
		lists.sort(new MyComparator1());
		lists.sort(new MyComparator1());
//		System.out.println(lists);
//		System.out.println(lists);
	}

}

//List = a group of numbers.
//
//Comparator object = a sorting rule.
//
//lists.sort(rule) = apply that sorting rule to arrange the list.
