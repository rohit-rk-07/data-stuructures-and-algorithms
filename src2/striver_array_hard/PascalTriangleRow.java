package striver_array_hard;

public class PascalTriangleRow {
	
	public void printRow(int row) {
		int ans = 1;
		int n = row;
		System.out.print(ans+" ");
		
		for(int i=1;i<n;i++) {
			ans = ans * (n-i);
			ans = ans / (i);
			System.out.print(ans+" ");
		}
	}

	public static void main(String[] args) {
		PascalTriangleRow obj = new PascalTriangleRow();
		obj.printRow(6);

	}

}
