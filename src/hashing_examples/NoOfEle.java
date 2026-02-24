package hashing_examples;

public class NoOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOfEle obj = new NoOfEle();
		int arr[] = {2,2,2,4,56,9,22,123,2,0,2,2};
		System.out.println(obj.HowManyEle(2, arr));
	}
	
	public int HowManyEle(int ele, int arr[]) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == ele) count++;
		}
		return count;
	}

}
