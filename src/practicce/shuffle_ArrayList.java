package practicce;
import java.util.ArrayList;
import java.util.Collections;
public class shuffle_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> element = new ArrayList<>();
		element.add("Red");
		element.add("Green");
		element.add("Orange");
		element.add("White");
		element.add("Black");
		System.out.println("Before :\n"+element);
		Collections.shuffle(element);
		System.out.println("After: \n"+element);
	}

}
