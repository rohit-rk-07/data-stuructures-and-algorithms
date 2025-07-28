package practicce;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class copy_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> List1 = new ArrayList<>();
		  List1.add("1");
		  List1.add("2");
		  List1.add("3");
		  List1.add("4");
		  System.out.println("List1: "+List1);
		  System.out.println();
		  
		  List<String> List2 = new ArrayList<>();
		  List2.add("A");
		  List2.add("B");
		  List2.add("C");
		  List2.add("D");
		  Collections.copy(List1, List2);
		  System.out.println("Copy List to List2, \n \nAfter copy: ");
		  System.out.println("List1: "+List1);
		  System.out.println("List2: "+List2);
	}
}
