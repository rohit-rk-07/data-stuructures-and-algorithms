package striver_array_medium;

public class Rotate_Arr_90d {
	
	public int[][] rotateMatrix(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		
		int[][] matrix2 = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
//				matrix2[i][j] = matrix[j][m-1-i];
				matrix2[j][m-1-i] = matrix[i][j]; 
			}
		}
		
		return matrix2;
	}

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		Rotate_Arr_90d obj = new Rotate_Arr_90d();
		int[][] matrix2 = obj.rotateMatrix(matrix);
		
		for (int[] row : matrix2) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
	}

}
