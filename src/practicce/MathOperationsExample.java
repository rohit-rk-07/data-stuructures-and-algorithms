package practicce;

class MathOperations {

    // Multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }

    // Multiply two doubles
    double multiply(double a, double b) {
        return a * b;
    }

    // Multiply three integers
    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class MathOperationsExample {
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();

        // Calling different versions of multiply()
        int result1 = mo.multiply(4, 5);              // two integers
        double result2 = mo.multiply(2.5, 3.0);       // two doubles
        int result3 = mo.multiply(2, 3, 4);           // three integers

        // Output the results
        System.out.println("Multiply two integers: " + result1);
        System.out.println("Multiply two doubles: " + result2);
        System.out.println("Multiply three integers: " + result3);
    }
}
