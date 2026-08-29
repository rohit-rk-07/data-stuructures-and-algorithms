package striver_array_medium;

public class SetMatrixZerosPractice {

	public void setZeroes(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		
		boolean firstRowZero = false;
		boolean firstColZero = false;
		
		//check if the first row has any 0s
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix[0][j] == 0) {
					firstRowZero = true;
					break;
				}
			}
		}
		
		//check if the first column has any 0s
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix[i][0] == 0) {
					firstColZero = true;
					break;
				}
			}
		}
		
		//mark the first row & column as markers
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				if(matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[j][0] = 0;
				}
			}
		}
		
		//set cells to zero based on the first row and column
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				if(matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			if(firstRowZero) {
				matrix[0][i] = 0;
			}
		}
		
		for(int j=0;j<m;j++) {
			if(firstColZero) {
				matrix[j][0] = 0;
			}
		}
		
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		SetMatrixZerosPractice obj = new SetMatrixZerosPractice();
		obj.setZeroes(matrix);
		for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
	}
}
