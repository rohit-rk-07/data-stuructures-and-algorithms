package oops_thing;

class Alien{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showData() {
		System.out.println(name+" "+age);
	}
	
}

public class GetNSet {

	public static void main(String[] args) {

		
//		new Alien().setName("bug").setAge(23).showData();
//		new Alien().setName("bug").setAge(23).showData();
		
		Alien obj = new Alien();
		obj.setName("Rohit");
		obj.setAge(23);
		obj.showData();
	}

}

// TODO Auto-generated method stub


