package StackPrograms;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "level";
		Stack<Character> stack  = new Stack<>();
		
		for(int i=0;i<input.length();i++) {
//			System.out.print(input.charAt(i));
			stack.push(input.charAt(i));
		}
		
		String reversed = "";
		while(!stack.isEmpty()) {
			reversed+=stack.pop();
		}
		
		if(input.equals(reversed)) {
			System.out.println(input+" is palindrome");
		} else {
			System.out.println(input+" is not a palindrome");
		}
	}

}
