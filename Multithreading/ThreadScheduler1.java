package Multithreading;

public class ThreadScheduler1 extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(n);
        }
    }
}

class C {
    public static void main(String[] args) {
        ThreadScheduler1 t1 = new ThreadScheduler1();
        ThreadScheduler1 t2 = new ThreadScheduler1();
        ThreadScheduler1 t3 = new ThreadScheduler1();

        t1.setName("Tabish1");
        t2.setName("Tabish2");
        t3.setName("Tabish3");

        t1.start();
        t2.start();
        t3.start();
    }
}