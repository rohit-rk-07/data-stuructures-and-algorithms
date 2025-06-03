//class StudentResult
//fields name, marks[]
//methods calculateTotal(), calculateAverage(), getGrade()

package practicce;

class StudentResult{
	String name;
	int[]marks;
	int totalMarks = 0;
	int avg;
	
	StudentResult(String name, int[]marks){
		this.name = name;
		this.marks = marks;
	}
	
	public void calculateTotal() {
//		int totalMarks = 0;
		for(int i=0;i<marks.length;i++) {
			totalMarks += marks[i];
		}
	}
	
	void calculateAverage() {
		avg = totalMarks / marks.length;
	}
	
	void getGrade() {
		System.out.println("Grade of "+name+" is "+avg);
	}
}

public class StudentResult_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentResult stu1 = new StudentResult("Rohit", new int[]{65,53,78,55,54});
		stu1.calculateTotal();
		stu1.calculateAverage();
		stu1.getGrade();
	}

}
