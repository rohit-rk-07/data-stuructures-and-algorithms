package oops_thing;

class One{
	public int add(int n1, int n2) {
		int res = n1 + n2;
		return res;
	}
}

class Two extends One{
	public int add(int n1, int n2) {
		int res = n1 + n2 + 2;
		return res;
	}
}

public class overRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two obj = new Two();
		int res = obj.add(2, 2);
		System.out.println(res);
	}

}
