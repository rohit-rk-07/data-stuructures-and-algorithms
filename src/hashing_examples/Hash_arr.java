package hashing_examples;
import java.util.Scanner;

public class Hash_arr {
	
	Scanner input = new Scanner(System.in);
	
	public void hash_fun() {
		int n = input.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();;
		}
		
		int[] hash = new int[13];
		for(int i=0;i<n;i++) {
			hash[arr[i]]++;
		}
		
		int q = input.nextInt();
		while(q-- > 0) {
			int number = input.nextInt();
			System.out.println("this no of times: "+hash[number]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash_arr obj = new Hash_arr();
		obj.hash_fun();
	}
	
}
