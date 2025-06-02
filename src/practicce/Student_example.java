//class with constructor

package practicce;

class Student{
	String name;
	int age;
	
	Student(String n, int a){
		name = n;
		age = a;
	}
	
	void show() {
		System.out.println("Name: "+name+", Age: "+age);
	}
}

public class Student_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Rahul",21);
		s1.show();

	}

}
