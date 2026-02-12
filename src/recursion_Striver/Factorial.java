package recursion_Striver;

public class Factorial {

	public int fact(int n) {
		if(n == 0) return 1;
		
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj = new Factorial();
		
		System.out.println(obj.fact(3));
	}

}
