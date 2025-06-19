package practicce;

import java.util.ArrayList;
import java.util.List;

// Subject class
class Subject {
    String subjectName;

    Subject(String subjectName) {
        this.subjectName = subjectName;
    }
}

// Teacher class
class Teacher {
    String name;
    List<Subject> subjects = new ArrayList<>();

    Teacher(String name) {
        this.name = name;
    }

    void assignSubject(Subject subject) {
        subjects.add(subject);
    }

    void displaySubjects() {
        System.out.println("Teacher: " + name);
        System.out.println("Subjects taught:");
        for (Subject s : subjects) {
            System.out.println(" - " + s.subjectName);
        }
    }
}

// Student class
class Student {
    String name;
    List<Subject> subjects = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollSubject(Subject subject) {
        subjects.add(subject);
    }

    void displaySubjects() {
        System.out.println("Student: " + name);
        System.out.println("Subjects enrolled:");
        for (Subject s : subjects) {
            System.out.println(" - " + s.subjectName);
        }
    }
}

// Main class
public class SchoolManagement {
    public static void main(String[] args) {
        // Create subjects
        Subject math = new Subject("Mathematics");
        Subject science = new Subject("Science");
        Subject english = new Subject("English");

        // Create teachers
        Teacher t1 = new Teacher("Mr. Sharma");
        Teacher t2 = new Teacher("Ms. Gupta");

        // Assign subjects to teachers
        t1.assignSubject(math);
        t1.assignSubject(science);
        t2.assignSubject(english);

        // Create students
        Student_GFG s1 = new Student_GFG("Rohit");
        Student_GFG s2 = new Student_GFG("Ananya");

        // Enroll students in subjects
        s1.enrollSubject(math);
        s1.enrollSubject(english);
        s2.enrollSubject(science);

        // Display teacher details
        t1.displaySubjects();
        t2.displaySubjects();

        System.out.println();

        // Display student details
        s1.displaySubjects();
        s2.displaySubjects();
    }
}
