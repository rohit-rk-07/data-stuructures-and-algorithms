package streamAPI;

import java.util.List;

public class Len_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("Java", "Hibernate", "Spring");
		
		words.stream()
				.map(String::length)
				.forEach(System.out::println);
	}

}
