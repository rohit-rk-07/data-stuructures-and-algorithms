package basic_math;

public class Reverse_Num {
	
	public int rev_num(int n) {
		
		int reverse = 0;
		
		while(n>0) {
			int last_dig = n%10;
			n = n/10;
			reverse = reverse*10 + last_dig;
		}
		
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_Num rev = new Reverse_Num();
		System.out.println(rev.rev_num(7789));
	}

}
