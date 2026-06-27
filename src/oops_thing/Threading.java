package oops_thing;

class First extends Thread{
	void show() {
		for(int i=0;i<150;i++) {
			System.out.println("hi");
		}
	}
}

class Second extends Thread{
	void show() {
		for(int i=0;i<160;i++) {
			System.out.println("hello");
		}
	}
}

public class Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First first = new First();
		Second second = new Second();
		
		first.show();
		second.show();
	}

}
