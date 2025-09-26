package LinkedListPrograms;

import java.util.Collections;
import java.util.LinkedList;

public class Shuffle_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();
		l_list.add("White");
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Blue");
		l_list.add("Black");
		l_list.add("Yellow");
		
		System.out.println("LL before shuffle: "+l_list);
		Collections.shuffle(l_list);
		System.out.println("LL after shuffle: "+l_list);
	}

}

//Write a Java program to shuffle elements in a linked list.
//Methods used here are: Collections.shuffle, .shuffle()
//.shuffle() -> Randomly permutes the specified list using a default 
//source of randomness. All permutations occur with approximately equal likelihood. 
