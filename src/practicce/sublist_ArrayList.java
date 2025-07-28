package practicce;
import java.util.ArrayList;
import java.util.List;
public class sublist_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		list.add("Pink");
		list.add("Yellow");
		System.out.println("Original list: \n"+list);
		System.out.println();
		List<String>sub_list = list.subList(0, 4);
		System.out.println("List of first 4 elements: \n"+sub_list);
	}

}
