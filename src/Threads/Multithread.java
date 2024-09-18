package Threads;
class MyTask extends Thread {
    public void run() {  
        for (int i = 0; i < 5; i++) {
            System.out.println("Doing task in thread: " + i);
        }
    }
}
class myTask implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Doing task in thread: " + i);
        }
    }
}
public class Multithread {
    public static void main(String[] args) {
        MyTask task = new MyTask();  // Step 2: Create an object of the MyTask class (thread)
        task.start();  // Step 3: Start the thread (it will run the code in the run method)       
        System.out.println("Main thread is still running.");
        // ----------------------------------------------------------
        myTask task2 = new myTask();  // Step 2: Create an object of the MyTask class (Runnable)
        Thread thread = new Thread(task2);  // Step 3: Pass the task to a new Thread
        thread.start();  // Step 4: Start the thread
        
        System.out.println("Main thread is still running.");
    }

}
//runnable is more flexible than when extending using threads