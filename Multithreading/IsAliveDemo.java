package Multithreading;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class IsAliveDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        System.out.println(t1.isAlive()); // false

        t1.start();

        System.out.println(t1.isAlive()); // true
    }
}