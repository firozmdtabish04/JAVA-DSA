package Multithreading;

import java.lang.Thread;

public class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("1");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }

}

class B {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t = new Thread1();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("2");
            Thread.sleep(1000);

        }

    }
}