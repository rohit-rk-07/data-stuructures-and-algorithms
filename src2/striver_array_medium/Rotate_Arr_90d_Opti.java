package striver_array_medium;

public class Rotate_Arr_90d_Opti {
	
	public int[][] rotateMatrix(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		
		//transpose of matrix
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix[j][i] == matrix[i][j]) {
					break;
				} else {
					int temp = matrix[j][i];
					matrix[j][i] = matrix[i][j];
					matrix[i][j] = temp;
				}
			}
		}
		
		//reverse rows of matrix to get the expected output
		for(int i=0;i<n;i++) {
			for(int j=0;j<m/2;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][m-1-j];
				matrix[i][m-1-j] = temp;
			}
		}
		
		return matrix;
	}

	public static void main(String[] args) {
		int[][] matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		Rotate_Arr_90d_Opti obj = new Rotate_Arr_90d_Opti();
		obj.rotateMatrix(matrix);

		for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
	}

}
