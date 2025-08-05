package practicce;
//import java.util.Queue;
import java.util.PriorityQueue;
public class gfg_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		
		//printing the top element of priorityqueue
		System.out.println(pQueue.peek());
		//printing the top element and removing it from
		//the priorityqueue container
		System.out.println(pQueue.poll());
		//printing the top element again
		System.out.println(pQueue.peek());
	}

}

//OUTPUT
//10
//10
//15
