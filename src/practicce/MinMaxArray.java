package practicce;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {15, 3, 9, 28, 6, 4};

        int max = numbers[0]; // Assume first element is max
        int min = numbers[0]; // Assume first element is min

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}
