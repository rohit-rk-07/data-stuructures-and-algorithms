package basic_math;

public class ArmStrong {
	
	public boolean armStrong(int n) {
		int sum = 0, dup = n;
		while(n>0) {
			int lastDig = n % 10;
			n = n / 10;
//			System.out.println(lastDig);
			sum = sum + (lastDig*lastDig*lastDig);
		}
		
		if(dup == sum) return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmStrong obj = new ArmStrong();
		System.out.println(obj.armStrong(371));
	}

}
