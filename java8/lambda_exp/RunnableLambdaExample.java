package lambda_exp;

class ThreadDemo implements Runnable {
	public void run() {
		System.out.println("run method called...");
	}
}

public class RunnableLambdaExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadDemo());
		thread.start();

		Runnable runnable = () -> System.out.println("run method called using lambda");
		
		
		Thread threadLamda = new Thread(runnable);
		threadLamda.start();
	}

}
