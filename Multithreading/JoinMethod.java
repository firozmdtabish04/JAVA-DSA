package Multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

public class JoinMethod {

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        t1.start();

        t1.join(); 

        System.out.println("Main Thread Finished");
    }
}