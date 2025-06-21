package practicce;

public class Sum_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Sum_arr = {6,5,4,3,2,1};
		int Sum = 0;
		for(int i=0;i<=Sum_arr.length;i++) {
			Sum = Sum + i;
		}
		System.out.println("Sum of array: "+Sum);
	}

}
