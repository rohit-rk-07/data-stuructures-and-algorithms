//class with getters and setters

package practicce;

class Employee{
	private String name;
	private double salary;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double s) {
		salary = s;
	}
	
	public double getSalary() {
		return salary;
	}
}

public class Employee_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.setName("Rohit");
		e1.setSalary(20000.00);
		
		System.out.println("Employee: "+e1.getName());
		System.out.println("Salary: "+e1.getSalary());

	}

}
