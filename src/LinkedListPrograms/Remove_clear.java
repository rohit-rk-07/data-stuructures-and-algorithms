package LinkedListPrograms;
import java.util.LinkedList;

public class Remove_clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<String>();
		l_list.add("White");
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Blue");
		l_list.add("Black");
		l_list.add("Yellow");
		
		System.out.println("Org LL: "+l_list);
		
		System.out.println("\nremove method: "+l_list.remove(0));
		System.out.println("white removed");
		
		System.out.println("\nremove first and last ele:");
		System.out.println("removed first ele: "+l_list.removeFirst());
		System.out.println("removed last ele: "+l_list.removeLast());
		
		System.out.println("\nPerforming clear method: ");
		l_list.clear();
		System.out.println("\nat the end: "+l_list);
	}
}

//Write a Java program to remove all elements from a linked list.
//Methods used here are: .remove() .removeFirst() .removeLast() .clear() 
