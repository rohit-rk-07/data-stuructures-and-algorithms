package practicce;
import java.util.*;
public class LinearSearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,3,4,1,6,7,14,9,32,};
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter target element: ");
		int target = in.nextInt();
		boolean found = false;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] == target) {
				System.out.println("Element "+target+" found at index "+i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Element "+target+" not found in the array.");
		}
	}

}
