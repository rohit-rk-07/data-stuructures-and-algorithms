package LinkedListPrograms;

import java.util.LinkedList;

public class Copy_LL {

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
		LinkedList<String> l_list2 = new LinkedList<>();
		l_list2 = (LinkedList)l_list.clone();
		System.out.println("\nCloned LL: "+l_list2);
	}

}

//Write a Java program to copy a linked list to another linked list.
//Methods used here are: .clone()
//.clone() -> Returns a shallow copy of this LinkedList. (The elements themselves are not cloned.)
