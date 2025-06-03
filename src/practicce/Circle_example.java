//class with overloaded constructors 

package practicce;

class Circle{
	double radius;
	
	Circle(){
		radius = 1.0;
	}
	
	Circle(double r){
		radius = r;
	}
	
	double area() {
		return 3.14 * radius * radius;
	}
}

public class Circle_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.0);
		
		System.out.println("area of default circle: "+c1.area());
		System.out.println("area of circle with radius 5: "+c2.area());
	}

}
