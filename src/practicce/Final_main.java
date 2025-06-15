package practicce;

class Final_child{
	public final int x;

	public Final_child() {
		this.x = 10;
	}
	
	public Final_child(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}
	
}

public class Final_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_child child = new Final_child();
		System.out.println(child.getX());
		
		Final_child child2 = new Final_child(99);
		System.out.println(child2.getX());
		
	}

}
