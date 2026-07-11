package streamAPI;

import java.util.List;

public class Odd_num_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(23,12,55,67,34,99,87,45);
		
		nums.stream()
				.filter(num -> num > 50)
				.filter( num -> num % 2 != 0)
				.forEach(System.out::println);
	}

}
