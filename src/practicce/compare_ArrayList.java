package practicce;
import java.util.ArrayList;

public class compare_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("White");
		list1.add("Pink");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("White");
		list2.add("Gray");
		list2.add("Blue");
		list2.add("Pink");
		
		ArrayList<String> list3 = new ArrayList<>();
		for(String cmpre : list1) {
			list3.add(list2.contains(cmpre) ? "yes" : "no");
		}
			System.out.println(list3);
		
	}
}

