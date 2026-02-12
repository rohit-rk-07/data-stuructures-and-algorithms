package recursion_Striver;

public class Sum_N_Nums {
	
	int sum = 0;
	public void sumofn(int i) {
		if(i<1) {
			System.out.println(sum);
			return;
		}
		sum = sum + i;
		sumofn(i-1);
	}

	public void sumofn2(int i, int sum) {
		if(i<1) {
			System.out.println(sum);
			return;
		}
		sumofn2(i-1, sum+i);
	}
	
	//the above both the functions are the parameterized ones.
	
	public int sumofn3(int n) {
		//this one is the functional type one
		if(n==0) return 0;
		
		return n + sumofn3(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_N_Nums obj = new Sum_N_Nums();
//		obj.sumofn(3);
//		obj.sumofn2(3, 0);
		System.out.println(obj.sumofn3(3));
	}

}
