package streamAPI;

import java.util.List;

public class Cnvrt_Str_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nums = List.of("10", "20", "30");
		
		nums.stream()
				.map(Integer::parseInt)
				.forEach(System.out::println);
	}

}
