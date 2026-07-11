package streamAPI;

import java.util.List;

public class Filter_A_Names {

	public static void main(String[] args) {
		List<String> names = List.of("Ankit", "Rohit", "Ajay", "Kiran", "Amit");
		
		names.stream()
				.filter(name -> name.startsWith("A"))
				.forEach(System.out::println);
	}

}
