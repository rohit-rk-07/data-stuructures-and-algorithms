package patterns;

public class Pattern {

	public void pattern13(int n){
		int num = 1;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++) {
            	System.out.print(num+" ");
            	num++;
            }
            System.out.println(" ");
        }
    }
	
	public void pattern14(int n) {
		for(int i=0;i<n;i++) {
			for(char ch='A';ch<='A'+i;ch++) {
				System.out.print(ch+" ");
			}
			System.out.println(" ");
		}
	}
	
	public void pattern15(int n) {
		for(int i=0;i<n;i++) {
			for(char ch='A';ch<='A'+(n-i-1);ch++) {
				System.out.print(ch+" ");
			}
			System.out.println(" ");
		}
	}

	public void pattern16(int n) {
		for(int i=0;i<=n;i++) {
			char ch = (char) ('A' + i);
			for(int j=0;j<=i;j++) {
				System.out.print(ch+" ");
			}
			
			System.out.println(" ");
		}
	}

	public void pattern17(int n) {
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			char ch='A';
			int breakpoint = (2*i+1) / 2;
			for(int j=0;j<=2*i+1;j++) {
				System.out.print(ch);
				if(j<=breakpoint) ch++;
				else ch--;
			}
			
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	
	public void pattern18(int n) {
		for(int i=0;i<n;i++) {
//			char ch = (char)('E'-i);
			for(char ch=(char)('E'-i); ch<='E'; ch++) {
				System.out.print(ch);
			}
			System.out.println(" ");
		}
	}

	public void pattern19(int n) {
		for(int i=0;i<n;i++) {
//			stars
			
//			spaces
			
//			stars
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubj
//		System.out.println("hello");
		Pattern pt = new Pattern();
		pt.pattern18(5);
	}

}

