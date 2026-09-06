package striver_array_medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix_leetcode {
	
	public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m-1;
        int top = 0, bottom = n-1;

        List<Integer> list = new ArrayList<>();

        while(top <= bottom && left <= right) {
            //traverse from left -> right
            for(int i=left; i<right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            //traverse from top -> bottom
            for(int i=top; i<=bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            //edge case if input has only one row
            if(top <= bottom) {
                //traverse from right -> left
                for(int i=right; i>=left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //edge case for the last element of the matrix ie. center element
            if(left <= right) {
                //traverse from bottom -> top
                for(int i=bottom; i>=top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }	

	public static void main(String[] args) {
		int[][] matrix = { {1,2,3,4,5,6}, {20,21,22,23,24,7}, {19,32,33,34,25,8}, {18,31,36,35,26,9}, {17,30,29,28,27,10}, {16,15,14,13,12,11}};
		Spiral_matrix_leetcode obj = new Spiral_matrix_leetcode();
		List<Integer> list = obj.spiralOrder(matrix);
		for(int val:list) {
			System.out.print(val+" ");
		}
	}

}
