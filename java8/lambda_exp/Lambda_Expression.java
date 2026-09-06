package lambda_exp;

interface Calculator {
	int calculate(int a, int b);
}

public class Lambda_Expression {

	public static void main(String[] args) {
		
		Calculator add = (a, b) -> a + b;
		Calculator multiply = (a, b) -> a * b;
		Calculator subtract = (a, b) -> a - b;
		
		System.out.println("Addition: "+add.calculate(10, 6));
		System.out.println("Multiply: "+multiply.calculate(2, 2));
		System.out.println("Subtract: "+subtract.calculate(3, 2));

	}

}
