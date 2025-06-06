//class Student with fields name and rollNo.
//extend it with Marksheet class that has marks1, marks2, marks3, and a method
//calculateTotal() which returns the total marks.
//create an object of Marksheet and display all details.

package practicce;

class Student1{
	String name;
	int rollNo;
}

class Marksheet extends Student1 {
	void calculateTotal(int marks1,int marks2,int marks3) {
		int totalMarks = marks1+marks2+marks3;
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+rollNo);
		System.out.println("Total marks: "+totalMarks);
	}
}

public class Student1_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marksheet ms = new Marksheet();
		ms.name = "Rohit";
		ms.rollNo = 59;
		ms.calculateTotal(50, 50, 50);
	}

}
