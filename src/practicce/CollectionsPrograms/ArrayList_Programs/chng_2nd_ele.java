package practicce.CollectionsPrograms.ArrayList_Programs;
import java.util.ArrayList;

public class chng_2nd_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> int_list = new ArrayList<>();
		
		int_list.add(1);
		int_list.add(2);
		int_list.add(3);
		int_list.add(4);
		int_list.add(5);
		
		System.out.println("rm 2nd ele: ");
		int_list.set(1, 2);
		
		System.out.println(int_list);
		
		System.out.println();
		int size = int_list.size();
		for(int i=0; i<size; i++) {
			System.out.println(int_list.get(i));
		}
	}

}
