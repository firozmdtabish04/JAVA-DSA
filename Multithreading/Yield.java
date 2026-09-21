package Multithreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            Thread.yield();
        }
    }
}

public class Yield {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            Thread.yield();
        }
    }
}