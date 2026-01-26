package patterns;

public class Pattern6 {
	
	public void pattern6(int n) {
		
		//outer loop which will loop for the rows
		for(int i=0;i<n;i++) {
			
			//looop will print the spaces
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			//loop will print asterisks
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	public void pattern7(int n) {
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*n-(2*i+1);j++) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern6 pt6 = new Pattern6();
		pt6.pattern6(5);
		pt6.pattern7(5);
	}

}
