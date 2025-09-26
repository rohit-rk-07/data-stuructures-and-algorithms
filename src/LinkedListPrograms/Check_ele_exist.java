package LinkedListPrograms;

import java.util.LinkedList;

public class Check_ele_exist {

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
		
		String ele_exis = (l_list.contains("Orange")?"Yes":"No");
		System.out.println("\nOrange exists ? :"+ele_exis);
		
		String ele_exis2 = (l_list.contains("White")?"Yes":"No");
		System.out.println("\nWhite exists ? :"+ele_exis2);
	}

}

//Write a Java program to check if a particular element exists in a linked list.
//Methods used here are: .contains()
//.contains() -> Returns true if this list contains the specified element.More formally, 
//returns true if and only if this list contains at least one element e such that (o==null ? e==null : o.equals(e)).

