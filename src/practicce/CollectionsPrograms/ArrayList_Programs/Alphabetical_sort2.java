package practicce.CollectionsPrograms.ArrayList_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class Alphabetical_sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add some strings to the list
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Cherry");

        // Print original list
        System.out.println("Original List: " + fruits);

        // Sort the list alphabetically
        Collections.sort(fruits);

        // Print sorted list
        System.out.println("Sorted List: " + fruits);
	}

}
