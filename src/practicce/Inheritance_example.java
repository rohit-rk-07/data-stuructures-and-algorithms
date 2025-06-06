//Multilevel inheritance
//create 3 classes
//Grandparent with method show()
//Parent extends Grandparent
//Child extends Parent
//Each class should override the show() method and print its class name.
//now create a Child object and call show(). 
package practicce;

class Grandparent{
	void show() {
		System.out.println("Grandparent class");
	}
}

class Parent extends Grandparent{
	@Override
	void show() {
		super.show();
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	@Override
	void show() {
		super.show();
		System.out.println("Child class");
	}
}

public class Inheritance_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.show();
	}

}
