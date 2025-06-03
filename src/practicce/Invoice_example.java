//class invoice for billing
//fields itemName, quantity, pricePerunit
//method to calculate and return total amount

package practicce;

public class Invoice_example {
    // Fields
    String itemName;
    int quantity;
    double pricePerUnit;

    // Constructor
    public Invoice_example(String itemName, int quantity, double pricePerUnit) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Method to calculate total amount
    public double calculateTotal() {
        return quantity * pricePerUnit;
    }

    // Method to display invoice details
    public void displayInvoice() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Unit: " + pricePerUnit);
        System.out.println("Total Amount: " + calculateTotal());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an Invoice object
        Invoice_example invoice1 = new Invoice_example("NoteBook", 2, 50.0);
        Invoice_example invoice2 = new Invoice_example("Pen", 3, 10.5);

        // Displaying invoice details
        invoice1.displayInvoice();
        System.out.println();
        invoice2.displayInvoice();
    }
}

