package practicce.CollectionsPrograms.ArrayList_Programs;

import java.util.LinkedList;

public class Rm_1st_Nth_Ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("Orange");
		
		System.out.println("The Org LL: "+l_list);
		
		Object firstElement = l_list.removeFirst();
		System.out.println("Ele rm: "+firstElement);
		
		Object lastElement = l_list.removeLast();
		System.out.println("Ele rm: "+lastElement);
		
		int i=0;
		while(i<l_list.size()) {
			System.out.print(" "+l_list.get(i));
			i++;
		}
	}

}
//Write a Java program to remove the first and last elements from a linked list.
//Methods used here are: .removeFirst() .removeLast() .size() .get() 
// .removeFirst() - Removes and returns the first element from this list.
// .removeLast() - Removes and returns the last element from this list.
