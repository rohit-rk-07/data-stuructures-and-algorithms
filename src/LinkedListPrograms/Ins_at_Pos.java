package LinkedListPrograms;
import java.util.LinkedList;

public class Ins_at_Pos {

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
		
		for(int i=0; i<l_list.size(); i++) {
			System.out.println(i+" "+l_list.get(i));
		}
		
		System.out.println("\nAdd Yellow after red\n");
		l_list.add(1, "Yellow");
		
		for(int i=0; i<l_list.size(); i++) {
			System.out.println(i+" "+l_list.get(i));
		}
	}

}

//Write a Java program to insert the specified element at the specified position 
//in the linked list.
//Methods used here are : .add() .size() .get() 
