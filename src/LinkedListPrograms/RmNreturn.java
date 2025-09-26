package LinkedListPrograms;

import java.util.LinkedList;

public class RmNreturn {

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
		System.out.println("\nrm ele: "+l_list.pop());
		System.out.println("\nLL after pop ope: "+l_list);
	}

}

//Write a Java program to remove and return the first element of a linked list.
//Methods used here are .pop()
//.pop() -> Pops an element from the stack represented by this list. In other 
//words, removes and returns the first element of this list. 
