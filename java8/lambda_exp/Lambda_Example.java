package lambda_exp;

interface Shape {
	void draw();
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("rectangle draw method");
	}
}

public class Lambda_Example {
	public static void main(String[] args) {
		
		Shape rectangle = () -> System.out.println("rectangle draw method");
		rectangle.draw();
	}
}
