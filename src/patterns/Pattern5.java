package patterns;

public class Pattern5 {

	public void pattern5(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void pattern6(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.println("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern5 pt5 = new Pattern5();
		pt5.pattern6(5);
	}

}
