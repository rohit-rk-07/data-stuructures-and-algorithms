package practicce;
import java.util.ArrayList;
public class removeAll_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("White");
		list1.add("Blue");
		list1.add("Red");
		list1.add("Green");
		list1.add("Purple");
		System.out.println("Before: "+list1);
		list1.removeAll(list1);
		System.out.println("After: "+list1);
	}
}
