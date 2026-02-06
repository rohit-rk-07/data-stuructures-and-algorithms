package basic_math;

public class PrimeNum1 {
	
	public static boolean prime(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count == 2) return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNum1 obj = new PrimeNum1();
		System.out.println(obj.prime(11));
	}

}
