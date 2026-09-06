package lambda_exp;

interface FuncInterface {
	void abstractFun(int x);
	
	default void normalFun() {
		System.out.println("Hello");
	}
}

public class Lambda_Expression3 {

	public static void main(String[] args) {
		FuncInterface fobj = (int x) -> System.out.println(2 * x);
		fobj.abstractFun(7);
	}

}
