//create a class car with fields model,year, and price. write a
//constructor to initialize values and a method displayCarInfo() to print the data

package practicce;

class Car2{
	String model;
	int year;
	int price;
	
	void displayCarInfo() {
		System.out.println("Car model "+model+", launched in year "+year+" starting from "+price);
	}
}

public class Car2_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c1 = new Car2();
		c1.model="Toyota";
		c1.year=2025;
		c1.price=40000;
		c1.displayCarInfo();
	}

}
