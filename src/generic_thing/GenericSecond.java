package generic_thing;

import java.util.ArrayList;

class Human {
	public void sleep() {
		System.out.println("Human needs to sleep");
	}
}

class Employee extends Human {
	public void sleep() {
		System.out.println("Emp need to sleep well");
	}
}

public class GenericSecond {

	public static void main(String[] args) {
		Human human = new Human();
		Employee emp = new Employee();
		
		human = emp;
		
		ArrayList<Human> humanList = new ArrayList<>();
		ArrayList<Employee> empList = new ArrayList<>();
		
//		humanList = empList; 
		
		ArrayList<Human> humanList2 = new ArrayList<>();
		humanList = humanList2;
		
		ArrayList<?> unknownList = new ArrayList<>();
		
		unknownList = empList;
	}

}
