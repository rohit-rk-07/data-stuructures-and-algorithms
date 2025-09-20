package LinkedListPrograms;

import java.util.LinkedList;
import java.util.Iterator;

public class LL_iterate {

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
		
		System.out.println("enhanced for loop");
		for(String element : l_list) {
			System.out.println(element);
		}
		
		System.out.println("\nfor loop");
		for(int i=0; i<l_list.size(); i++) {
			System.out.println(l_list.get(i)+"-index: "+i);
		}
		
		System.out.println("\nWhile loop");
		int i=0;
		while(i<l_list.size()) {
			System.out.println(l_list.get(i)+"-index: "+i);
			i++;
		}
		
		System.out.println("\nThrough iterator interface");
		Iterator it = l_list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

//Java: Iterate through all elements in a linked list.
//Methods used here are .get() .size() .add() .hasNext() .next()
//.hasNext() Returns true if the iteration has more elements.
//.next() Returns the next element in the iteration.