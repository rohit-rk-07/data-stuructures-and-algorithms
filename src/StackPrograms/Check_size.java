package StackPrograms;
import java.util.Stack;

public class Check_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<>();
		System.out.println("default size: "+stk.size());
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.push(6);
		System.out.println("after add ele: "+stk.size());
	}
}

//Find the size of the Stack
//Push 5 elements and print the current size using size().