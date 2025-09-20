package LinkedListPrograms;
import java.util.LinkedList;
public class LL_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();
		
		l_list.add(2, "Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add(1, "White");
		l_list.add("Pink");
		l_list.add("Blue");
		l_list.add(0, "Yellow");
		
		System.out.println("The linked list: "+l_list);
	}

}
//Write a Java program to append the specified element to the end of a linked list.
//.add() method takes one parameter of index and value.
//.add(0, "Yellow") .add(4, "Blue")

//Methods used are: .add(i,v);