package practicce;

public class Generic_Method {

	public static <T> void printArray(T[] array) {
		for(T item : array) {
			System.out.print(item+"\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Jenny","Liam"};
		
		Integer[] numbers = {1,2,3};
		
		Double[] floats = {2.1,2.2,2.3,2.4};
		
		printArray(names);
		printArray(numbers);
		printArray(floats);

	}

}
