package Multithreading;
import java.util.*;

class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class SleepThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
