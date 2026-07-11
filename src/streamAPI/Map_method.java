package streamAPI;

import java.util.List;

public class Map_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("hisenberg", "peter", "john", "tuco", "mike");
		
		names.stream()
				.map(name -> name.toUpperCase())
				.forEach(System.out::println);
	}

}
