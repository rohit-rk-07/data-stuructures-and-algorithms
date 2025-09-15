package practicce.CollectionsPrograms.ArrayList_Programs;
import java.util.ArrayList;

public class Print_Ele_Pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str_list = new ArrayList<>();
		str_list.add("Red");
		str_list.add("Green");
		str_list.add("Black");
		str_list.add("White");
		str_list.add("Pink");
		
		System.out.println("\nOriginal array list: "+str_list);
		System.out.println("\nPrint using index of an element: ");
		int no_of_ele = str_list.size();
		
		for(int i=0; i<no_of_ele; i++) {
			System.out.println(str_list.get(i));
		}
	}

}
