package practicce;
import java.util.ArrayList;
import java.util.Collections;

public class reverse_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println("Original List: \n"+list);
		Collections.reverse(list);
		System.out.println();
		System.out.println("Reversed List: \n"+list);
	}

}
