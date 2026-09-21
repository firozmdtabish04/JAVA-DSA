package Multithreading;

class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread Sleeping...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

public class InterruptDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();

        t1.interrupt();
    }
}