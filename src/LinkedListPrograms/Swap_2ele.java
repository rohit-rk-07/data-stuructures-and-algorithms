package LinkedListPrograms;
import java.util.Collections;
import java.util.LinkedList;
public class Swap_2ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();
		l_list.add("White");
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Blue");
		l_list.add("Black");
		l_list.add("Yellow");
		
		System.out.println("The Org LL with ind: ");
		int i=0;
		while(i<l_list.size()) {
			System.out.println(l_list.get(i)+" -> "+i);
			i++;
		}
		
		Collections.swap(l_list, 0, 5);
		System.out.println("\nafter swap: "+l_list);
	}

}

//Write a Java program that swaps two elements in a linked list.
//Methods used here are: .swap()
//void java.util.Collections.swap;
//.swap() -> Swaps the elements at the specified positions in the specified list.
//(If the specified positions are equal, invoking this method leaves the list unchanged.)
