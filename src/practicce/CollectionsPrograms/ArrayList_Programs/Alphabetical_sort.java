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

        System.out.println("Original List: " + fruits);

        for (int i = 0; i < fruits.size() - 1; i++) {
            for (int j = 0; j < fruits.size() - i - 1; j++) {
                if (fruits.get(j).compareTo(fruits.get(j + 1)) > 0) {
                    String temp = fruits.get(j);
                    fruits.set(j, fruits.get(j + 1));
                    fruits.set(j + 1, temp); 
                }
            }
        }

        System.out.println("Sorted List: " + fruits);
	}

}
