package oops_thing;

public class Str_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Rohit");
		int capacity = sb.capacity();
		int length = sb.length();
//		System.out.println(capacity);
//		System.out.println(length);
		
		StringBuilder strbuild = new StringBuilder("Rohit");
		strbuild.append(" RK");
		System.out.println(strbuild);
	}

}
