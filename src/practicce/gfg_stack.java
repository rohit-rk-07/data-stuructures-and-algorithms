package practicce;
import java.util.Iterator;
import java.util.Stack;
public class gfg_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");
		stack.push("Geeks");
		
		//Iterator for the stack
		Iterator<String> itr = stack.iterator();
		
		//printing the stack
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		stack.pop();
		
		//iterator for the stack
		itr = stack.iterator();
		
		//printing the stack
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}

//OUTPUT
//Geeks For Geeks Geeks 
//Geeks For Geeks 