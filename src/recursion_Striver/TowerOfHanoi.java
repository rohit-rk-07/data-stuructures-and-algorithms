package recursion_Striver;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerOfHanoi obj = new TowerOfHanoi();
		obj.Toh(3 , "Source", "Destination", "Helper");
	}
	
	void Toh(int n, String s, String d, String h) {
		if(n<=0) {
			return;
		}
		else {
			Toh(n-1, s, h, d);
			System.out.println("Disk "+n+" moved from "+s+" to "+d);
			Toh(n-1, h, d, s);
		}
	}
 }
