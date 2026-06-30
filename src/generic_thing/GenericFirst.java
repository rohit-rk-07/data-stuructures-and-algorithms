package generic_thing;

class Student<T> {
	T obj;
	
	public Student(T obj) {
		this.obj = obj;
	}
	
	public void display() {
		System.out.println("type of data used: "+obj.getClass().getName());
	}
	
	public T getObj() {
		return obj;
	}
}

public class GenericFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<String> st1 = new Student<>("Rohit");
		st1.display();
		System.out.println(st1.getObj());
		
		System.out.println();
		
		Student<Integer> st2 = new Student<>(20);
		st2.display();
		System.out.println(st2.getObj());
	}

}
