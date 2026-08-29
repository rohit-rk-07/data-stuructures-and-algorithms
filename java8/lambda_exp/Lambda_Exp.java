package lambda_exp;

interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle class: draw() method");
	}
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square class: draw() method");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle class: draw() method");
	}
}

public class Lambda_Exp {
	public static void main(String[] args) {
		
//		Shape rectangle = () -> System.out.println("Rectangle class: draw() method");
//		rectangle.draw();
		
//		Shape square = () -> System.out.println("Square class: draw() method");
//		square.draw();
		
		print(() -> System.out.println("Rectangle class: draw() method"));
		print(() -> System.out.println("Square class: draw() method"));
		
	}
	
	private static void print(Shape shape) {
		shape.draw();
	}
}
