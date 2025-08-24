//Write a program to check whether an ArrayList contains a given element.

package practicce.CollectionsPrograms.ArrayList_Programs;
import java.util.ArrayList;
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listStr = new ArrayList<>();
		listStr.add("Peter");
		listStr.add("Lois");
		listStr.add("Meg");
		listStr.add("Steve");
		listStr.add("Chris");
		
		boolean check = listStr.contains("Meg");
		if(check) {
			System.out.println("Yeah Meg is alive");
		} else {
			System.out.println("What Meg");
		}
	}

}
