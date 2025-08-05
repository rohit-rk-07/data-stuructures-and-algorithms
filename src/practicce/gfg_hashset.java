package practicce;
import java.util.HashSet;
import java.util.Iterator;
public class gfg_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Geeks");
		hs.add("For");
		hs.add("Geeks");
		hs.add("Is");
		hs.add("Very helpful");
		
		System.out.println(hs);
		
		//Traversing elements
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

//OUTPUT
//[Very helpful, Geeks, For, Is]
//Very helpful
//Geeks
//For
//Is