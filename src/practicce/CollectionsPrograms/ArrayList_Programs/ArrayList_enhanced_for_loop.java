package practicce.CollectionsPrograms.ArrayList_Programs;

import java.util.ArrayList;

public class ArrayList_enhanced_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strlist = new ArrayList<>();
		strlist.add("Peter");
		strlist.add("Lois");
		strlist.add("Steve");
		strlist.add("Meg");
		strlist.add("Chirs");
		strlist.add("Braien");
		
		for(String elements : strlist) {
			System.out.print(elements+", ");
		}
	}

}
