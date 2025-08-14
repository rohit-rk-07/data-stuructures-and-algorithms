package practicce;

public class generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.setValue(1);
		int i = (Integer) box.getValue();
		System.out.println(i);
	}

}
