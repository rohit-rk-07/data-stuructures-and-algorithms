//Example of Arrays of Objects
//Example: 
//Here we are taking a student class and creating an array of Student 
//with five Student objects stored in the array. The Student objects have to be instantiated 
//using the constructor of the Student class, and their references should be assigned to the array elements

package practicce;

class Student_GFG1{
	public int roll_no;
	public String name;
	
	Student_GFG1(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}
	
}

public class Student_GFG {
	
	public static void main(String[] args) {
		// declares an array of Student
		Student_GFG1[] arr;
		
		//allocating memory for 5 objects of type student.
		arr = new Student_GFG1[5];
		
		//initialize the elements of the array
		arr[0] = new Student_GFG1(1,"aman");
		arr[1] = new Student_GFG1(2,"vaibhav");
		arr[2] = new Student_GFG1(3,"shikar");
		arr[3] = new Student_GFG1(4,"dharmesh");
		arr[4] = new Student_GFG1(5,"mohit");

		//accessing the elements of the specified array
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at "+i+" :{ "+arr[i].roll_no+", "+arr[i].name+" }");
		}
		
	}

}
