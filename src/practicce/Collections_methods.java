package practicce;
import java.util.ArrayList;
import java.util.Collections;
public class Collections_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lists = new ArrayList<>();
		
		// add() method used to insert values or elements in an ArrayList
		System.out.println("ArrayList add() method.");
		lists.add("Peter");
		lists.add("Lois");
		lists.add("Steve");
		lists.add("Chris");
		lists.add("Meg");
		lists.add("Braien");
		System.out.println(lists);
		
		System.out.println("");
		
		//get() method used to access an element from the ArrayList
		System.out.println("ArrayList get() method.");
		System.out.println("Accessing an element: "+lists.get(0));
		
		System.out.println("");
		
		//set() method used to modify or insert an element in ArrayList
		System.out.println("Modifing or inserting an element in ArrayList.");
		System.out.println("inserting element: "+lists.set(5, "Quagmire"));
		
		System.out.println();
		//contains() method to check if an elements is present ?
		System.out.println("Checking for an element in ArrayList: ");
		
		if(lists.contains("Meg")) {
			System.out.println("Meg is present");
		} else {
			System.out.println("Meg is not present");
		}
		
		System.out.println();
		//Sort an ArrayList by sort() method 
		System.out.println("Sorted ArrayList: ");
		Collections.sort(lists);
		System.out.println(lists);
		
	}

}
