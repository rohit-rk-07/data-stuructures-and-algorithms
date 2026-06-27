package oops_thing;

//Step 1: Create a task by implementing the Runnable interface
class CountTask implements Runnable {
 private final String threadName;

 public CountTask(String name) {
     this.threadName = name;
 }

 // Step 2: Define the job inside the run() method
 @Override
 public void run() {
     for (int i = 1; i <= 50; i++) {
         System.out.println(threadName + " is counting: " + i);
         try {
             // Pause the thread briefly to simulate work
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             System.out.println(threadName + " was interrupted.");
         }
     }
     System.out.println(threadName + " has finished.");
 }
}

public class Threading2 {
 public static void main(String[] args) {
     System.out.println("Main thread starts.");

     // Step 3: Create Thread objects and pass your tasks to them
     Thread thread1 = new Thread(new CountTask("Thread A"));
     Thread thread2 = new Thread(new CountTask("Thread B"));

     // Step 4: Start the threads
     thread1.start();
     thread2.start();

     System.out.println("Main thread ends (but background threads keep running).");
 }
}
