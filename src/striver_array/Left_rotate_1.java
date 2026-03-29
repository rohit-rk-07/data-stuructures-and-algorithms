package striver_array;

public class Left_rotate_1 {

	public void left_rotate_by_one(int[] arr) {
		int temp = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] = temp;
		
		for(int val : arr) {
			System.out.print(val);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		Left_rotate_1 obj = new Left_rotate_1();
		obj.left_rotate_by_one(arr);
	}

}
