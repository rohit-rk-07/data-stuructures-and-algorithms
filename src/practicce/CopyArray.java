package practicce;

class CopyArray{
	public static void main(String[] args) {
		int[] orgArr = {10,20,30,40,50};
		
		int[] copyArr = new int[orgArr.length];
		
		for(int i=0;i<orgArr.length;i++) {
			copyArr[i]=orgArr[i];
		}
		
		System.out.print("Copied Array: ");
		for(int value : copyArr) {
			System.out.print(value+" ");
		}
	}
}

