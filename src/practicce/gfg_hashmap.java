package practicce;
import java.util.HashMap;
import java.util.Map;
public class gfg_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Geeks");
		hm.put(2, "For");
		hm.put(3, "Geeks");
		hm.put(4, "Good!");
		
		System.out.println("Value for 1 is "+hm.get(1));
		
		//Traversing through the HashMap
		for(Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}

//OUTPUT
//Value for 1 is Geeks
//1 Geeks
//2 For
//3 Geeks
//4 Good!