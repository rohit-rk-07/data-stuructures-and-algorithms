//basic program - creating a class and object

package practicce;
class Car{
	String brand = "Toyota";
	int speed = 120;
	
	void display() {
		System.out.println("Brand: "+brand);
		System.out.println("Speed: "+speed);
	}
}

public class car_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.display();
	}

}
