package StackPrograms;
import java.util.Stack;

public class Search_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk = new Stack<>();
		stk.push("Peter");
		stk.push("Lois");
		stk.push("Chris");
		stk.push("Steve");
		stk.push("Brain");
		stk.push("Meg");
		
		if(stk.search("Meg")==1) {
			System.out.println("is Meg dead ? No\n");
		}
		
		while(!stk.empty()) {
			System.out.print(stk.pop()+"\t");
		}
	}

}

//Search an element in Stack
//Use search() method to find an element’s position from the top.