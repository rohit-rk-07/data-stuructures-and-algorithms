package comparable_comparator;
import java.util.*;

class Student implements Comparable<Student>{

	int roll;
	String name;
	
	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Student other) {
		return this.roll - other.roll;
	}
	
//	public int compareTo(Student other) {
//		return this.name.compareTo(other.name); 
//	}


	@Override
	public String toString() {
//		return "Student [roll=" + roll + ", name=" + name + "]";
		return roll+" - "+name;
	}
	
	
}

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student(107, "Peter"));
		list.add(new Student(104,"Quag"));
		list.add(new Student(109,"John"));
		list.add(new Student(103,"Black"));
		list.add(new Student(100,"Brain"));
		
		Collections.sort(list);
		
		System.out.println("Sorted Students by roll number: ");
		for(Student s : list) {
			System.out.println(s);
		}
	}

}

//This is the most important part 🔸
//compareTo is called automatically by Collections.sort().
//It compares the current object (this) with another object (other).
//If:
//result is negative → this comes before other
//result is zero → both are equal
//result is positive → this comes after other
//👉 So if this.roll = 101 and other.roll = 103
//101 - 103 = -2 → 101 comes before 103.
