package streamAPI;

import java.util.List;

public class Str_len_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("Java", "Spring", "Hibernate", "SQL", "Streams");
		
		words.stream()
				.filter(word -> word.length() > 5)
				.forEach(System.out::println);
	}

}
