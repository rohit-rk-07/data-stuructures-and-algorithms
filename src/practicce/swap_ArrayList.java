package practicce;
import java.util.ArrayList;
import java.util.Collections;

//Java: Swap two elements in an array list

public class swap_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("red");
		list.add("green");
		list.add("white");
		list.add("black");
		list.add("pink");
		
		System.out.println("ArrayList before swap: ");
		for(String a : list) {
			System.out.print(a+" ");
		}
		System.out.println("");
		Collections.swap(list, 0, 2);
		System.out.println("ArrayList after swap: ");
		for(String b: list) {
			System.out.print(b+" ");
		}
	}

}
