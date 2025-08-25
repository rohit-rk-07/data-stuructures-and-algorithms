package practicce.CollectionsPrograms.ArrayList_Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numlist = new ArrayList<>();
		numlist.add(1);
		numlist.add(2);
		numlist.add(3);
		numlist.add(4);
		numlist.add(5);
		numlist.add(6);
		
		Iterator<Integer> it = numlist.iterator();
		
		while(it.hasNext()) {
			int nums = it.next();
			System.out.print(nums+" ");
		}
	}

}
