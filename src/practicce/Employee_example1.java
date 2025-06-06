//Hierarchical inheritance
//create a class Employee
//create 2 classes Manager and Developer 
//that inherit from Employee
//all classes should have a method work() that prints 
//a message indicating the type of work.

package practicce;

class Employee1{
	void work() {
		System.out.println("works for company on small tasks as employee");
	}
}

class Manager extends Employee1{
	void work() {
		System.out.println("works for company by handeling all employees ");
	}
}

class Developer extends Employee1{
	void work() {
		super.work();
		System.out.println("works for company by developing apps or websites to clients");
	}
}

public class Employee_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer dev = new Developer();
		dev.work();
	}

}
