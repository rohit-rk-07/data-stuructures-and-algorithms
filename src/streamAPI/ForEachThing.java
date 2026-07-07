package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachThing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(4,5,6,4,5,3,2,1);
		
//		Consumer<Integer> con = (Integer n) -> {
//			System.out.print(" "+n);
//		};
//		
//		nums.forEach(con);
		
		nums.forEach( n -> System.out.println(n));
	}
}