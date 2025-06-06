//create base class vehicle with constructor that prints "Vehicle created"
//create a derived class car which calls the parent constructor using super 
//and also prints "Car created" in its own constructor

package practicce;

class Vehicle{
	Vehicle(){
		System.out.println("Vehicle created.");
	}
}

class Bike extends Vehicle{
	Bike(){
		super();
		System.out.println("Bike created");
	}
}

public class Vehicle_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike();
	}

}
