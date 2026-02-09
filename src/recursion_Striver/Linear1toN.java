package recursion_Striver;

public class Linear1toN {

	public void linear(int i, int n) {
		if(i>n) {
			return;
		}
		System.out.println(i);
		linear(i+1, n);
	}
	
	public void RevLinear(int i, int n) {
		if(i<1) {
			return;
		}
		System.out.println(i);
		RevLinear(i-1, n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linear1toN obj = new Linear1toN();
//		obj.linear(1, 5);
		obj.RevLinear(3, 3);
	}

}
