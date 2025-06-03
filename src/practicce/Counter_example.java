//static members in class

package practicce;

class Counter{
	static int count = 0;
	
	Counter(){
		count++;
		System.out.println("Object count: "+count);
	}
}

public class Counter_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

	}

}
