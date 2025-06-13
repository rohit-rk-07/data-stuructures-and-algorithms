//Create classes: Product, CartItem, Cart.
//Allow adding/removing products to/from the cart, and calculating the total bill.
//Use encapsulation and collections (like ArrayList).

package practicce;

import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// CartItem class
class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters
    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemTotal() {
        return product.getPrice() * quantity;
    }
}

// Cart class
class Cart {
    private List<CartItem> items = new ArrayList<>();

    // Add product to cart
    public void addProduct(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
        System.out.println(quantity + " x " + product.getName() + " added to cart.");
    }

    // Remove product by ID
    public void removeProduct(int productId) {
        boolean found = false;
        for (CartItem item : items) {
            if (item.getProduct().getId() == productId) {
                items.remove(item);
                System.out.println(item.getProduct().getName() + " removed from cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + productId + " not found in cart.");
        }
    }

    // Display all items in cart
    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("Items in Cart:");
        for (CartItem item : items) {
            System.out.println("- " + item.getProduct().getName() +
                               " (Qty: " + item.getQuantity() +
                               ", Price: ₹" + item.getProduct().getPrice() +
                               ", Total: ₹" + item.getItemTotal() + ")");
        }
        System.out.println("Total Bill: ₹" + getTotalBill());
    }

    // Calculate total bill
    public double getTotalBill() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getItemTotal();
        }
        return total;
    }
}

// Main class
public class ShoppingCartApp {
    public static void main(String[] args) {
        // Create some products
        Product p1 = new Product(101, "Laptop", 50000);
        Product p2 = new Product(102, "Mouse", 800);
        Product p3 = new Product(103, "Keyboard", 1500);

        // Create cart
        Cart myCart = new Cart();

        // Add products
        myCart.addProduct(p1, 1);
        myCart.addProduct(p2, 2);
        myCart.addProduct(p3, 1);

        System.out.println();

        // Display cart
        myCart.displayCart();

        System.out.println();

        // Remove a product
        myCart.removeProduct(102);

        System.out.println();

        // Display updated cart
        myCart.displayCart();
    }
}
