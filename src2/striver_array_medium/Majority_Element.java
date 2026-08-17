package striver_array_medium;

public class Majority_Element {
	
	public int majorEle(int[] arr) {
		int element = 0, count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(count == 0) {
				count = 1;
				element = arr[i];
			} else if(element == arr[i]) {
				count++;
			} else {
				count--;
			}
		}
		
		int count1=0;
		for(int i=0;i<arr.length;i++) {
			if(element == arr[i]) {
				count1++;
			}
		}
		
		if(count1 > arr.length/2) return element;
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {2,2,1,3,3,3,3,3};
		int[] arr2 = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
		int[] arr3 = {3,3,4};
		Majority_Element obj = new Majority_Element();
		System.out.println(obj.majorEle(arr3));

	}

}
