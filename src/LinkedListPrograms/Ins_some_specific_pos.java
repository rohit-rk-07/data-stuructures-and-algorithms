package LinkedListPrograms;

import java.util.LinkedList;

public class Ins_some_specific_pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		
		System.out.println("Org LL: "+l_list);
		
		LinkedList<String> l_list2 = new LinkedList<>();
		l_list2.add("White");
		l_list2.add("Blue");
		l_list2.add("Gray");
		
		l_list.addAll(1,l_list2);
		
		System.out.println("\nNew one: "+l_list);
	}
}
//Write a Java program to insert some elements at the specified position into a linked list.
//Methods used : .addAll() .add() 
//.addAll() - Inserts all of the elements in the specified collection into this list, starting at the specified position. 
