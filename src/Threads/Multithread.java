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
        MyTask task = new MyTask();  
        task.start();       
        System.out.println("Main thread is still running.");
        // ----------------------------------------------------------
        myTask task2 = new myTask();  
        Thread thread = new Thread(task2);  
        thread.start();  
        
        System.out.println("Main thread is still running.");
    }

}
//runnable is more flexible than when extending using threads