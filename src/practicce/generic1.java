package practicce;

public class generic1 {
	public static void main(String[]args) {
//		Box<Integer> box = new Box<>();
//		box.setValue(1);
//		int val = box.getValue();
//		System.out.println(val);
		
		Pair<String, Integer> pair = new Pair<>("Peter", 40);
		
		System.out.print(pair.getKey()+" ");
		System.out.print(pair.getValue());
	}

}
