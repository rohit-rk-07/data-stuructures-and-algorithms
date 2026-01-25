package patterns;

public class Pattern2 {

	public void pattern2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern2 pt2 = new Pattern2();
		pt2.pattern2(5);
	}

}
