package practicce;
import java.util.ArrayList;
public class clone_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("White");
		list1.add("Blue");
		list1.add("Red");
		list1.add("Green");
		list1.add("Purple");
		
		System.out.println("Org List: "+list1);
		System.out.println();
		ArrayList<String> list2 = (ArrayList<String>)list1.clone();
		System.out.println("Clone List: "+list2);
	}

}
