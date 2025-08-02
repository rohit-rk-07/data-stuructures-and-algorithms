package practicce;
import java.util.ArrayList;
import java.util.Collections;
//Java: Join two array lists

public class join2_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("red");
		list1.add("green");
		list1.add("blue");
		list1.add("white");
		System.out.println("list1: "+list1);
		System.out.println("");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("orange");
		list2.add("gray");
		list2.add("black");
		list2.add("red");
		System.out.println("list2: "+list2);
		System.out.println("");
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println("new list3: "+list3);
	}

}
