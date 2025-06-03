//class book 
//fields title,author,price
//method isExpensive() which returns true if price > 500.

package practicce;

class Book1{
	String title;
	String author;
	int price;
	
	public boolean isExpensive(){
//		System.out.println("This is expensive");
		return price > 500;
	}
	void displayBook() {
		System.out.println("Title: "+title);
		System.out.println("author: "+author);
		System.out.println("price: "+price);
		if(isExpensive()) {
			System.out.println("This is expensive");
		} else {
			System.out.println("Not expensive");
		}
	}
}

public class Book1_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1 = new Book1();
		b1.title="Java";
		b1.author="James";
		b1.price = 750;
		b1.displayBook();
		
	}

}
