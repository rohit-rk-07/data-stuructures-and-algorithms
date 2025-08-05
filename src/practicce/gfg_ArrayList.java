package practicce;
import java.util.ArrayList;
public class gfg_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			al.add(i);
		}
		System.out.println(al);
		al.remove(3);
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
	}

}

//OUTPUT
//[1, 2, 3, 4, 5]
//[1, 2, 3, 5]
//1 2 3 5 