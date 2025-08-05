package practicce;
import java.util.ArrayDeque;
public class gfg_arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> de_que = new ArrayDeque<>(10);
		
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);
		
		System.out.println(de_que);
		
		de_que.clear();
		
		//addFirst() method to insert the element at the head
		de_que.addFirst(564);
		de_que.addFirst(291);
		
		//addLast() method to insert the element at the tail
		de_que.addLast(24);
		de_que.addLast(14);
		
		System.out.println(de_que);
	}

}

//OUTPUT
//[10, 20, 30, 40, 50]
//[291, 564, 24, 14]