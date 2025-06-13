package practicce;

public class Library {

    String name;

    // Constructor
    public Library(String name) {
        this.name = name;
    }

    // Method to show library details
    public void showLibraryDetails() {
        System.out.println("Library Name: " + name);
    }

    // Non-static inner class
    class Book {
        String title;
        String author;

        // Constructor for Book
        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        // Method to show book details
        void showBookDetails() {
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            // Accessing outer class field
            System.out.println("Belongs to Library: " + name);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a Library object
        Library myLibrary = new Library("Central City Library");

        // Display library details
        myLibrary.showLibraryDetails();

        // Create Book objects using the outer class instance
        Library.Book book1 = myLibrary.new Book("The Java Handbook", "James Smith");
        Library.Book book2 = myLibrary.new Book("Data Structures in Depth", "Alice Johnson");

        // Display book details
        System.out.println("\nBook 1 Details:");
        book1.showBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.showBookDetails();
    }
}
