package practicce;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class gfg_linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("Geeks");	
		lhs.add("For");	
		lhs.add("Geeks");	
		lhs.add("Is");	
		lhs.add("Very helpful");
		
		//Traversing elements
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

//OUTPUT
//Geeks
//For
//Is
//Very helpful
