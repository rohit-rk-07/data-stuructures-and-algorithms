package basic_math;

public class GCD {
	
	public static int findGCD(int a, int b) {
		while(a>0 && b>0) {
			if(a>b) a = a % b;
			else b = b % a;
		}
		if(a==0) return b;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD obj = new GCD();
		System.out.println(obj.findGCD(20, 22));
	}

}
