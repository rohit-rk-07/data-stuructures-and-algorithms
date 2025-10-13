package Copy_on_Write_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list = new ArrayList<>();              //java.util.ConcurrentModificationException
		List<String> list = new CopyOnWriteArrayList<>();  //by using the CopyOnWriteArrayList we can read and add the items concurrently
		
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		for(String value : list) {
			System.out.print(value+" ");
			
			//adding an element while reading
			if(value.equals("four")) {
				list.add("five");
				System.out.println("added five while reading the list");
			}
			
		}
		System.out.print("\n"+list);
	}
}
