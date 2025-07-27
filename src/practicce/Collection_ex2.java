package practicce;
import java.util.ArrayList;

public class Collection_ex2 {
	public static void main(String[] args) {
		ArrayList<Double> numberList = new ArrayList<>();
		numberList.add(Double.valueOf(25.5)); // auto-boxing
		System.out.println(numberList);
		System.out.println(numberList.get(0).doubleValue()); //
	}
}
