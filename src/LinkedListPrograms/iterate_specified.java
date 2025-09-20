package LinkedListPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class iterate_specified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Blue");
		l_list.add("White");
		l_list.add("Pink");
		l_list.add("Black");
		l_list.add("Purple");
		
		Iterator p = l_list.listIterator(1);
		
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}

}

//Write a Java program to iterate through all elements in a linked list
//starting at the specified position.
//Methods used here .add() .listIterator() .hasNext() .next()
//.listIterator() - Returns a list iterator over the elements in this list (in propersequence).
//.hasNext() - returns true if it has next elements to iterate
//.next() - returns the element 