package lambda_exp;

public class Lambda_Expression2 {
	
	interface Add {
		int addition(int a, int b);
	}

	public static void main(String[] args) {
		Add add = (a, b) -> a + b;
		
		int result = add.addition(2, 2);
		System.out.println(result);
	}

}
