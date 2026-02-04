package basic_math;

public class Basic_math1 {

	public int digit(int n) {
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic_math1 math = new Basic_math1();
		System.out.println("no's of digits "+math.digit(778649));
	}

}
