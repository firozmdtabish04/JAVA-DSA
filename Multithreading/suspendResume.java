package Multithreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class suspendResume {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        t1.start();

        Thread.sleep(2000);

        t1.suspend(); // Deprecated
        System.out.println("Thread Suspended");

        Thread.sleep(2000);

        t1.resume(); // Deprecated
        System.out.println("Thread Resumed");
    }
}