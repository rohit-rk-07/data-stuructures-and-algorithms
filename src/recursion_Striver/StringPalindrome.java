package recursion_Striver;

public class StringPalindrome {
	
	public boolean checkPalindrome(int i, String str, int n) {
		if(i>=str.length()/2) return true;
		
		if(str.charAt(i) != str.charAt(n-i-1)) return false;
		
		return checkPalindrome(i+1, str, n);
//		return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindrome obj = new StringPalindrome();
		String str = "MADM";
		int n = str.length();
		System.out.println(obj.checkPalindrome(0,str, n));
	}

}
