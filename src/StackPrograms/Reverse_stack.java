package StackPrograms;

import java.util.Stack;

public class Reverse_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk1 = new Stack<>();
		Stack<Integer> stk2 = new Stack<>();
		
		stk1.push(6);
		stk1.push(5);
		stk1.push(4);
		stk1.push(3);
		stk1.push(2);
		stk1.push(1);
		
		while(!stk1.isEmpty()) {
			int top = stk1.pop();
			stk2.push(top);
		}
		
		Stack<String> str_stk1 = new Stack<>();
		Stack<String> str_stk2 = new Stack<>();
		str_stk1.push("a");
		str_stk1.push("b");
		str_stk1.push("c");
		str_stk1.push("d");
		str_stk1.push("e");
		str_stk1.push("f");
		
		System.out.println("reversed: "+stk2);
		
		while(!str_stk1.isEmpty()) {
			String top = str_stk1.pop();
			str_stk2.push(top);
		}
		System.out.println("reversed: "+str_stk2);
	}

}

//Push elements, then pop and push into another Stack to reverse them.

//push elements
//pop elements
//push into another 