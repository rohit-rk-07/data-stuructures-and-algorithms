package practicce;
//Count the number of even and odd elements in an array
//(num % 2 == 0) even
//(num % 5 == 0) odd
//prints the even and odd elements separately.
public class EvenOddArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,6,8,10,11,13,99,45,67};
		int evenCount=0;
		int oddCount=0;
		
		System.out.print("Even elements: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(+arr[i]+" ");
				evenCount++;
			}
		}
		
		System.out.print("\nOdd elements: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
				oddCount++;
			}
		}
		System.out.println("");
		System.out.println("Even: "+evenCount);
		System.out.println("Odd: "+oddCount);
	}
}
