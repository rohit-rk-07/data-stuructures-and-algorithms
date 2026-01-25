package patterns;

public class Pattern3 {

	public void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			} 
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern3 pt3 = new Pattern3();
		pt3.pattern3(5);
	}

}
