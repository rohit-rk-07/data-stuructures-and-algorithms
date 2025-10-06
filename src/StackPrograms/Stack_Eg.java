package StackPrograms;
import java.util.Stack;

public class Stack_Eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<>();
		stk.push(11);
		stk.push(12);
		stk.push(13);
		stk.push(14);
		stk.push(15);
		stk.push(16);
		
		int size = stk.size();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = stk.pop();
			System.out.print(arr[i]+"\t");
			
			if(i==2) {
				System.out.println("peek value: "+stk.peek());
				break;
			}
		}
		
	}

}

//Create a Stack and perform basic operations
//Push a few integers
//Pop one element
//Display the top element using peek()