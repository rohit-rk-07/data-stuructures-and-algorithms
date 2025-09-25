package practicce.CollectionsPrograms.ArrayList_Programs;

import java.util.Comparator;
import java.util.LinkedList;

public class Display_Ele_Pos  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Blue");
		l_list.add("Black");
		l_list.add("Yellow");
		
		System.out.println("Org LL: "+l_list);
		
		for(int i=0; i<l_list.size(); i++) {
			System.out.println("Ele at index: "+i+" - "+l_list.get(i));
		}
		
		
	}

}

//Write a Java program to display elements and their positions in a linked list.
//Methods used here are .add() .size() .get()
