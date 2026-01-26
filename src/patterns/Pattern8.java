package patterns;

public class Pattern8 {

	public void pattern8(int n) {
		for(int i=1;i<=n*2-1;i++) {
			
			int stars = i;
			if(i>n) stars = 2*n-i;
			
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern8 pt8 = new Pattern8();
		pt8.pattern8(5);
	}

}
