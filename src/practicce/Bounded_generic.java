package practicce;

public class Bounded_generic<T extends Number> {
	T[] nums;
	
	Bounded_generic(T[] nums){
		this.nums = nums;
	}
	
	double average() {
		double sum = 0;
		for(T num : nums) {
			sum+=num.doubleValue();
		}
		return sum/nums.length;
	}
	
}

class Bounded_Main{
	public static void main(String[] args) {
		Integer[] intNums = {10,20,30,40};
		Bounded_generic<Integer> boundInteger = new Bounded_generic<>(intNums);
		System.out.println("Integer average: "+boundInteger.average());
		
		Double[] doubleNums = {1.2,1.4,23.3};
		Bounded_generic<Double> boundDouble = new Bounded_generic<>(doubleNums);
		System.out.println("Double average: "+boundDouble.average());
	}
}
