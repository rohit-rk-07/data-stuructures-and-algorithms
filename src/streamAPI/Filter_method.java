package streamAPI;

import java.util.List;

public class Filter_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(2,5,8,9,10,15,20);
		
		numbers.stream().filter( num -> num % 2 == 0).forEach(System.out::println);
	}

}
