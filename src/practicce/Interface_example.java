//Create an interface Printable with method print().
//Implement it in classes Document and Photo.
//Call the print() method using interface reference.

package practicce;

interface Printable{
	void print();
}

class Document implements Printable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printable method called by Document class");
	}
	
}

class Photo implements Printable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printable method called by Photo class");
	}
	
}

public class Interface_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable doc = new Document();
		doc.print();
		Printable img = new Photo();
		img.print();
	}

}
