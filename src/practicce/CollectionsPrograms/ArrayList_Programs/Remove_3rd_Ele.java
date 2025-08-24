//Write a program to remove the third element from an ArrayList.

package practicce.CollectionsPrograms.ArrayList_Programs;
import java.util.ArrayList;
public class Remove_3rd_Ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("before: "+list);
		list.remove(2);
		System.out.println("after: "+list);
		
		ArrayList<String> strlist = new ArrayList<>();
		strlist.add("Red");
		strlist.add("Blue");
		strlist.add("Green");
		strlist.add("Yellow");
		strlist.add("Black");
		System.out.println("before: "+strlist);
		strlist.remove(2);
		System.out.println("before: "+strlist);
	}

}
