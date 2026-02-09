package recursion_Striver;

public class Backtrack_N_1 {
	
	public void fun(int i) {
		if(i==0) {
			return;
		}
		System.out.println(i);
		
		fun(i-1);
//		System.out.println(i);
	}

	public void fun2(int i, int n) {
		if(i>n) {
			return;
		}
		
//		System.out.println(i);
		fun2(i+1, n);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Backtrack_N_1 obj = new Backtrack_N_1();
//		obj.fun(5);
		obj.fun2(1, 5);
	}

}
