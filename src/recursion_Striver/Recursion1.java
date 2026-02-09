package recursion_Striver;

public class Recursion1 {
	
	int count = 1;
	public void recur() {
		if(count == 10) {
			return;
		}
		System.out.println(count++);
		recur();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion1 obj = new Recursion1();
		obj.recur();
	}

}
