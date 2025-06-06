//class Animal with a method makeSound()
//create a derived class dog that overrides makeSound() to print "Dog barks"
// in main method, an object dog call the makeSound() method.

package practicce;

class Animal{
	public void makeSound() 
	{
		System.out.println("All animals make sound");
	}
}

class Dog extends Animal{
	public void makeSound(String Dog) {
		System.out.println("Dogs make sound!");
	}
}

public class Animal_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.makeSound();
		dog.makeSound(null);
	}

}
