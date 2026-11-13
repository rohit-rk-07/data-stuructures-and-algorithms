package binarySearchHard;

import java.util.Arrays;

public class BookAllocationProblem {
	
	public int calcPages(int[] arr, int pages) {
		int stu = 1, pagesStudent=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(pagesStudent + arr[i] <= pages) {
				pagesStudent += arr[i];
			} else {
				stu++;
				pagesStudent = arr[i];
			}
		}
		
		return stu;
	}
	
	public int bookAlloc(int[] arr, int students) {
		int low = Arrays.stream(arr).max().getAsInt(), high = Arrays.stream(arr).sum();
		int pages;
		for(pages = low; pages <= high; pages++) {
			int cntStud = calcPages(arr, pages);
			if(cntStud == students)
				return pages;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {25, 46, 28, 49, 24};
		BookAllocationProblem obj = new BookAllocationProblem();
		int res = obj.bookAlloc(arr, 4);
		System.out.println(res);
	}

}
