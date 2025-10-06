package StackPrograms;
import java.util.Stack;

public class Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<>();
		stk.push(9);
		stk.push(8);
		stk.push(7);
		stk.push(6);
		stk.push(5);
		stk.push(4);
		
		System.out.print(stk+" ");
		System.out.println();
		
		for(int n:stk) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
		while(!stk.empty()) {
			System.out.print(stk.pop()+" ");
		}
	}
}

//Check if Stack is empty or not
//Use empty() method and print appropriate message.