package striver_array_medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
	
	public List<Integer> sprialMatrix(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		int n = matrix.length;
		int m = matrix[0].length;
		int left = 0, right = m-1;
		int top = 0, bottom = n-1;
		
		while(top <= bottom && left <= right) {
			
			//the 1st traverse left -> right
			for(int i=left; i<=right; i++) {
				list.add(matrix[top][i]);
			}
			top++;
			
			//the 2nd traverse top -> bottom
			for(int i=top; i<=bottom; i++) {
				list.add(matrix[i][right]);
			}
			right--;
			
			//edge case for input if it's only 1 row
			if(top < bottom) {
				//the 3rd traverse right -> left
				for(int i=right; i>=left; i--) {
					list.add(matrix[bottom][i]);
				}
				bottom--;
			}
			
			//edge case for the last element of the matrix, for the center one
			if(left <= right) {
				//the 4th traverse bottom -> top
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
		Spiral_Matrix obj = new Spiral_Matrix();
		List<Integer> list = obj.sprialMatrix(matrix);
		for(int val:list) {
			System.out.print(val+" ");
		}
	}

}
