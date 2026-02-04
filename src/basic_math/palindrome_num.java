package basic_math;

public class palindrome_num {
	
	public boolean palindrome(int n) {
		int dup = n;
		int rev = 0;
		while(n>0) {
			int lastdig = n%10;
			n = n/10;
			rev = (rev*10) + lastdig;
		}
		if(dup == rev) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome_num pal = new palindrome_num();
		System.out.println(pal.palindrome(121));
	}

}
