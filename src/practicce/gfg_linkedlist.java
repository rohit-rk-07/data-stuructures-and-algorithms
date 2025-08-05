package practicce;
import java.util.LinkedList;
public class gfg_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		
		//appending new elements at the end of the list
		for(int i=1;i<=5;i++) {
			ll.add(i);
		}
		System.out.println(ll);
		
		ll.remove(3);
		
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
	}
		
	}	

}

//OUTPUT
//[1, 2, 3, 4, 5]
//[1, 2, 3, 5]
//1 2 3 5 