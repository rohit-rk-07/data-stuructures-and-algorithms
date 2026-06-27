package oops_thing;

class Calc{
	public void addSub(int n1, int n2) {
		int sum = n1 + n2;
		int sub = n1 - n2;
		System.out.println(sum+" "+sub);
	}
}

class AdvCalc extends Calc{
	public void mulDiv(int n1, int n2) {
		int mul = n1 * n2;
		int div = n1 / n2;
		System.out.println(mul+" "+div);
	}
}

class veryAdvCalc extends AdvCalc{
	public void powNum(int n1, int n2) {
		double res = Math.pow(n1, n2);
		System.out.println(res);
	}
}

public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		veryAdvCalc obj = new veryAdvCalc();
		obj.addSub(3, 2);
		obj.mulDiv(15, 2);
		obj.powNum(2, 2);
	}

}
