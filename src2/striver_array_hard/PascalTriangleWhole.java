package striver_array_hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleWhole {
	
	public List<List<Integer>> printTriangle(int num) {
		List<List<Integer>> nestedList = new ArrayList<>();
		
		for(int i=0;i<num;i++) {
			
			List<Integer> list = new ArrayList<>();
			long ans = 1;
			list.add(1);
			
			for(int j=1;j<=i;j++) {
				ans = ans * (i-j+1);
				ans = ans / (j);
				list.add((int)ans);
			}
			
			nestedList.add(list);
		}
		
		return nestedList;
	}

	public static void main(String[] args) {
		PascalTriangleWhole obj = new PascalTriangleWhole();
		List<List<Integer>> result = obj.printTriangle(5);
		System.out.println(result);
	}

}
