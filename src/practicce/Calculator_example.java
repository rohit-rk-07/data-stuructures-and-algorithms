//class with method returning a value

package practicce;

class Calculator{
	int add(int a, int b) {
		return a+b;
	}
}

public class Calculator_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		int result = c1.add(2, 2);
		System.out.println("Sum: "+result);
	}
}
