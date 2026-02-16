package recursion_Striver;

public class Fibonacci_no {
	
	public int fibo(int n) {
		if(n<=1) return n;
		
		return fibo(n-1) + fibo(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci_no obj = new Fibonacci_no();
		System.out.println(obj.fibo(9));
	}

}
