//composition (Has-a-relationship)

package practicce;

class Engine{
	void start() {
		System.out.println("Engine starting...");
	}
}

class Car1{
	Engine engine = new Engine();
	
	void startCar() {
		engine.start();
		System.out.println("Car is running.");
	}
}

public class Car1_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car = new Car1();
		car.startCar();
	}

}
