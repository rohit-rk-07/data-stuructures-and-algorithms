package practicce;
import java.util.TreeSet;
import java.util.Iterator;
public class gfg_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Geeks");
		ts.add("For");
		ts.add("Geeks");
		ts.add("Is");
		ts.add("Very helpful");
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

//OUTPUT
//For
//Geeks
//Is
//Very helpful
