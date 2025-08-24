//Write a program to insert an element at the first position of an ArrayList.

package practicce.CollectionsPrograms.ArrayList_Programs;
import java.util.ArrayList;
import java.util.List;

public class Insert_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("before: "+list);
		list.add(0, 0);
		System.out.println("after: "+list);
		
		List<String> strlist = new ArrayList<>();
		strlist.add("Red");
		strlist.add("Blue");
		strlist.add("Green");
		strlist.add("Yellow");
		strlist.add("Black");
		System.out.println("before: "+strlist);
		strlist.add(0, "White");
		System.out.println("after: "+strlist);
	}

}
