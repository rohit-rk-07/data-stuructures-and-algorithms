package LinkedListPrograms;

import java.util.LinkedList;

public class Ins_1st_Nth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		System.out.print("Org LL: ");
		int i=0;
		while(i<l_list.size()) {
			System.out.print(" "+l_list.get(i));
			i++;
		}
		
		l_list.addFirst("White");
		
		l_list.addLast("Pink");
		
		System.out.print("\nAfter adding first and last: ");
		int j=0;
		while(j<l_list.size()) {
			System.out.print(" "+l_list.get(j));
			j++;
		}
	}

}

//Write a Java program to insert elements into the linked list at the first and 
//last positions.
//Methods used here are : .addFirst() .addLast() .size() .get() .add()
//.addFirst() - Inserts the specified element at the beginning of this list.
//.addLast() - Appends the specified element to the end of this list. 


