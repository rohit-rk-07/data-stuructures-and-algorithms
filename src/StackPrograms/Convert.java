package StackPrograms;

import java.util.ArrayList;
import java.util.Stack;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> str_stk = new Stack<>();
		ArrayList<String> list = new ArrayList<>();
		
		str_stk.push("a"); 
		str_stk.push("b");
		str_stk.push("c");
		str_stk.push("d");
		str_stk.push("e");
		
		System.out.println("This is stack");
		while(!str_stk.isEmpty()) {
			String top = str_stk.pop();
			list.add(top);
		}
		
		System.out.println(list);
		
		
		//this wont print anything cause the the condition is always false.
		int i=0;
		while(i<str_stk.size()) {
			System.out.print(list.get(i));
			i++;
		}
	}

}
