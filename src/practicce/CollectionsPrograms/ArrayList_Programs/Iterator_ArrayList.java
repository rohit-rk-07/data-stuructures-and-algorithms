package practicce.CollectionsPrograms.ArrayList_Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strlist = new ArrayList<>();
		strlist.add("Peter");
		strlist.add("Lois");
		strlist.add("Steve");
		strlist.add("Meg");
		strlist.add("Chirs");
		strlist.add("Braien");
		
		Iterator<String> it = strlist.iterator();
		
		System.out.println("Iterating using Iterator: ");
		while(it.hasNext()) {
			String names = it.next();
			System.out.print(names+", ");
		}
	}

}
