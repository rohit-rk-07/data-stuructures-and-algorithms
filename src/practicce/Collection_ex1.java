package practicce;
import java.util.ArrayList;

public class Collection_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listNames = new ArrayList<>();
		listNames.add("Peter");
		listNames.add("Lois");
		listNames.add("Meg");
		listNames.add("Braen");
		listNames.add("Steve");
		listNames.add("Chris");
		for(String Names:listNames) {
			System.out.print(Names);
			System.out.print(". ");
		}
	}
}
