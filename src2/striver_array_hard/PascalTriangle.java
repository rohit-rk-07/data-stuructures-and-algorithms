package striver_array_hard;

public class PascalTriangle {
	
	public int nCr_func(int n, int r) {
		int res = 1;
		
		for(int i=0;i<r;i++) {
			res = res * (n-i);
			res = res / (i+1);
		}
		
		return res;
	}

	public static void main(String[] args) {
		PascalTriangle obj = new PascalTriangle();
		int row = 5, col = 3;
		System.out.println(obj.nCr_func(row-1, col-1));
		
	}

}
