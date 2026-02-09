package recursion_Striver;

public class PrintName {

	int count = 0;
	public void printname() {
		System.out.println("Rohit "+count);
		if(count == 10) {
			return;
		}
		count++;
		printname();
	}

	public void printname2(int i, int n) {
		System.out.println("Rohit - "+i);
		if(i>n) {
			return;
		}
		printname2(i+1, n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintName obj = new PrintName();
//		obj.printname();
		obj.printname2(0, 5);
	}

}
