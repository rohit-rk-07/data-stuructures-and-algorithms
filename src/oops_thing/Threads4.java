package oops_thing;

// Runnable vs Throwable

class A1 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(10);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B1 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(10);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Threads4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A1 obj1 = new A1();
//		B1 obj2 = new B1();
		
		Runnable obj1 = () -> {
			for(int i=1;i<=5;i++) {
				System.out.println("HI");
				try {
					Thread.sleep(10);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable obj2 = () -> {
			for(int i=1;i<=5;i++) {
				System.out.println("HELLO");
				try {
					Thread.sleep(10);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
	}

}
