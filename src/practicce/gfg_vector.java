package practicce;
import java.util.Vector;
public class gfg_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		//Appending new elements at the end of the list
		for(int i=0;i<=5;i++) {
			v.add(i);
		}
		System.out.println(v);
		
		v.remove(3);
		
		System.out.println(v);
		
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");
		}
	}

}


//OUTPUT
//[0, 1, 2, 3, 4, 5]
//[0, 1, 2, 4, 5]
//0 1 2 4 5 