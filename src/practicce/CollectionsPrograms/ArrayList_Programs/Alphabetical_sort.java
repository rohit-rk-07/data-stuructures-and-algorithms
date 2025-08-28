package practicce.CollectionsPrograms.ArrayList_Programs;

import java.util.ArrayList;

public class Alphabetical_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Cherry");

        // Print original list
        System.out.println("Original List: " + fruits);

        // Bubble Sort logic
        for (int i = 0; i < fruits.size() - 1; i++) {
            for (int j = 0; j < fruits.size() - i - 1; j++) {
                // compare two strings
                if (fruits.get(j).compareTo(fruits.get(j + 1)) > 0) {
                    // swap if they are in wrong order
                    String temp = fruits.get(j);
                    fruits.set(j, fruits.get(j + 1));
                    fruits.set(j + 1, temp); 
                }
            }
        }

        // Print sorted list
        System.out.println("Sorted List: " + fruits);
	}

}
