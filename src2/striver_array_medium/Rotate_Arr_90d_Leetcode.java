package striver_array_medium;

public class Rotate_Arr_90d_Leetcode {
	
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[j][i] == matrix[i][j]){
                    break;
                } else {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                System.out.print(matrix[i][j]);
            }
            System.out.print(" ");
        }
    }

	public static void main(String[] args) {
		Rotate_Arr_90d_Leetcode obj = new Rotate_Arr_90d_Leetcode();
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		obj.rotate(matrix);
	}

}
