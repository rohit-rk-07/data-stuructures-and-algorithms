//final keyword, if used with class then the class cannot be inherited.
//final keyword, if used with method then the method cannot be over-ridden.
//final keyword, if used with variable then it will act as an constant it's value cannot be changed.

package practicce;

class Final_parent{
	public final void India() {
		System.out.println("India is great!!");
	}
	
	public final void USA() {
		System.out.println("USA is fantastic!!");
	}
}

class Final_child extends Final_parent{

	public void India2() {
		System.out.println("India is great and indians are nice");
	}
	
	public void USA2() {
		System.out.println("USA is fantastic!! with nice ppl");
	}
	
//	public final int x;
//
//	public Final_child() {
//		this.x = 10;
//	}
//	
//	public Final_child(int x) {
//		this.x = x;
//	}
//
//	public int getX() {
//		return x;
//	}
	
}

public class Final_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_child child = new Final_child();
		child.India();
		child.USA();
		child.India2();
		child.USA2();
//		System.out.println(child.getX());
//		
//		Final_child child2 = new Final_child(99);
//		System.out.println(child2.getX());
		
	}

}


//it is what it is because, you let it so.
