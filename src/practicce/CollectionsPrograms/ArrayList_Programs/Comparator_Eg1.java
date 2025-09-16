package practicce.CollectionsPrograms.ArrayList_Programs;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student{
	String name;
	int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.age, s2.age); //ascending order
	}
}

public class Comparator_Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		students.add(new Student("Peter", 45));
		students.add(new Student("Lois", 42));
		students.add(new Student("Chris", 20));
		students.add(new Student("Meg", 17));
		students.add(new Student("Steve", 12));
		
		Collections.sort(students, new AgeComparator());
		
		for(Student s : students) {
			System.out.println(s.name+" - "+s.age);
		}
	}

}
