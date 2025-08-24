package practicce.CollectionsPrograms.ArrayList_Programs;

import java.util.ArrayList;

public class Iterate_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strlist = new ArrayList<>();
		strlist.add("Peter");
		strlist.add("Lois");
		strlist.add("Steve");
		strlist.add("Meg");
		strlist.add("Chirs");
		strlist.add("Braien");
		int size = strlist.size();
		
//		String arr[] = {"Peter","Lois","Steve","Meg","Chris","Braien"};
		for(int i=0;i<size;i++) {
//			System.out.println(strlist.toArray()[i]);
			System.out.println(strlist.get(i));
		}
	}

}
