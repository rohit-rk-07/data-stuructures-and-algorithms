package practicce;

public class Test<T> {
	T obj;
	Test(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}

class Main{
	public static void main(String[] args) {
		Test<Integer> Iobj = new Test<>(15);
		System.out.println(Iobj.getObject());
		
		Test<String> Sobj = new Test<>("Hello world!");
		System.out.println(Sobj.getObject());
	}
}
