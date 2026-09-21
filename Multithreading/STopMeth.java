package Multithreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

public class STopMeth {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        t1.start();

        Thread.sleep(3000);

        t1.stop(); // Deprecated
        System.out.println("Thread Stopped");
    }
}