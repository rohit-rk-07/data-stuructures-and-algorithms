package practicce;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {95, 3, 9, 28, 6, 4, 1};

        int max = numbers[0]; // Assume first element is maximum
        int min = numbers[0]; // Assume first element is minimum
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("Largest element: " + max +" found at index ["+maxIndex+"]");
        System.out.println("Smallest element: " + min +" found at index ["+minIndex+"]");
    }
}
