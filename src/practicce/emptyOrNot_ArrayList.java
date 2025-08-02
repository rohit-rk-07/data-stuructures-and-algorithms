package practicce;
import java.util.ArrayList;
public class emptyOrNot_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("White");
		list1.add("Blue");
		list1.add("Red");
		list1.add("Green");
		list1.add("Purple");
		System.out.println("Org List: "+list1);
		System.out.println("Is empty? "+list1.isEmpty());
		System.out.println();
		list1.removeAll(list1);
		System.out.println("Array list after remove all elements "+list1);
		System.out.println("Checking the above array list is empty or not! "+list1.isEmpty());
	}

}
