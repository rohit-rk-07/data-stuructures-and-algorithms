package streamAPI;

import java.util.List;

public class Map_sqr_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(2,3,4,5);
		
		nums.stream()
				.map(num -> num * num)
				.forEach(System.out::println);
	}

}
