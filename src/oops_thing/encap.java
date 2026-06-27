package oops_thing;

class Human{
	private String name;
	private int age;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
}

public class encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Human();
		
		obj.setName("Rohit");
		obj.setAge(23);
		
		System.out.println(obj.getName()+" "+obj.getAge());
	}

}
