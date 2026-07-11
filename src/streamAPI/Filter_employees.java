package streamAPI;

import java.util.List;

class Employee {
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return name+"---->"+salary;
	}
}

public class Filter_employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = List.of(
							new Employee("Peter", 60000),
							new Employee("John", 20000),
							new Employee("Quagmire", 80000),
							new Employee("bGuy", 70000)
							);
		
		employees.stream()
			.filter(emp -> emp.getSalary() > 50000)
			.forEach(System.out::println);
	}

}
