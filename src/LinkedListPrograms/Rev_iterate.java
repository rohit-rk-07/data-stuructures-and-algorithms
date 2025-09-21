package LinkedListPrograms;
import java.util.LinkedList;
import java.util.Iterator;
public class Rev_iterate {

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
		
		System.out.println("Org LL: "+l_list);
		
		Iterator it = l_list.descendingIterator();
		
		System.out.println("\nElements in Reverse Order: ");
		int i=l_list.size();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}

}

//Write a Java program to iterate a linked list in reverse order.


//Methods used here
//.add() .hasNext() .next()
//.descendingIterator()-Returns an iterator over the elements in this deque in 
//reversesequential order. The elements will be returned in order fromlast (tail) to first (head).