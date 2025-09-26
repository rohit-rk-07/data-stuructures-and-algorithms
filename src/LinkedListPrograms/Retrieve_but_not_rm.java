package LinkedListPrograms;

import java.util.LinkedList;

public class Retrieve_but_not_rm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();
		l_list.add("White");
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Blue");
		l_list.add("Black");
		l_list.add("Yellow");
		
		System.out.println("Org LL: "+l_list);
		String first = l_list.peekFirst();
		String last = l_list.peekLast();
		System.out.println("retrieved 1st: "+first);
		System.out.println("retrieved Nth: "+last);

	}

}

//Write a Java program to retrieve, but not remove, the first element of a linked list.
//Methods used here are: .peekFirst() .peekLast()
//.peekFirst() -> Retrieves, but does not remove, the first element of this list,or returns null if this list is empty.
//.peekLast() -> Retrieves, but does not remove, the last element of this list,or returns null if this list is empty.

