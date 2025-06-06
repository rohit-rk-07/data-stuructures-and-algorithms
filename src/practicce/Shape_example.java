//class shape with method draw()
//two subclasses Circle and Rectangle that override draw() and print appropriate message
//an array of Shape references, store both Circle and Rectangle objects 
//and call draw() using a loop

//Inheritance: Circle and Rectangle inherit from Shape.
//Method Overriding: draw() is overridden in both subclasses.
//Polymorphism: The Shape reference calls the 
//overridden methods based on the actual object type at runtime.

package practicce;

class Shape{
	void draw() {
		System.out.println("drawing a shape");
	}
}

class Circle1 extends Shape{
	void draw() {
		System.out.println("drawing a circle");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing a rectangle");
	}
}

public class Shape_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle1();
		shapes[1] = new Rectangle();
		
		for(Shape s : shapes) {
			s.draw();
		}
	}

}


/*1. Shape[] shapes = new Shape[2];
This creates an array of references of type Shape.
It can hold any object that is-a Shape, including Circle and Rectangle.
new Shape[2] means we are allocating space for 2 elements in the array.

2. shapes[0] = new Circle();
We're storing a Circle object in the first element of the array.
Circle is a subclass of Shape, so this works (polymorphism).

3. shapes[1] = new Rectangle();
We're storing a Rectangle object in the second element of the array.

4. Loop: for (Shape s : shapes)
This is a for-each loop.
It goes through each object in the shapes array.
On each loop, the current object is stored in the variable s.

5. s.draw();
This calls the draw() method of the current object.
Due to runtime polymorphism (dynamic method dispatch), the actual 
object's version of draw() gets called:
For shapes[0], it's a Circle → prints "Drawing a circle."
For shapes[1], it's a Rectangle → prints "Drawing a rectangle."

Summary:
The main method demonstrates polymorphism — the ability to use a single interface
 (Shape) to represent different object types (Circle, Rectangle) and call 
 the appropriate draw() method for each at runtime. */
