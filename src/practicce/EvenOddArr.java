package practicce;
//Count the number of even and odd elements in an array.
//(num % 2 == 0) even
//(num % 5 == 0) odd
public class EvenOddArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,6,8,10,11,13,99,45,67};
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even: "+evenCount);
		System.out.println("Odd: "+oddCount);
	}
}
