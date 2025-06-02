//class with multiple objects

package practicce;

class Book{
	String title;
	String author;
	
	Book(String t, String a){
		title = t; 
	    author = a;
	    System.out.println(title+" by "+author);
	}
	
}

public class Book_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Java","James");
		Book b2 = new Book("OOP","John");

	}

}
