package Multithreading;

class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

public class SetPriorityDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1

        t1.start();
        t2.start();
    }
}