package recursion_Striver;

public class ByBacktrack {
	
	public void fun(int i) {
		if(i<1) {
			return;
		}
		
		fun(i-1);
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByBacktrack obj = new ByBacktrack();
		obj.fun(3);
	}

}
