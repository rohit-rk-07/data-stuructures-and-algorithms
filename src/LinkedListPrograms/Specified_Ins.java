package LinkedListPrograms;
import java.util.LinkedList;
public class Specified_Ins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		
		System.out.println("insert at first: "+l_list);
		
		l_list.offerFirst("White");
		System.out.println("after: "+l_list);
		
		LinkedList<String> l_list2 = new LinkedList<>();
		l_list2.add("Red");
		l_list2.add("Green");
		l_list2.add("Black");
		
		System.out.println("\ninsert at last: "+l_list2);
		
		l_list2.offerLast("White");
		
		System.out.println("after: "+l_list2);
	}

}

//Write a Java program to insert the specified element at the front and last of a linked list.
//Methods used here are: .offerFirst() .offerLast() .add()
//.offerFirst() - Inserts the specified element at the front of this list.
//.offerLast() - Inserts the specified element at the end of this list.


