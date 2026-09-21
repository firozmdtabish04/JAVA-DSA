package Multithreading;

import java.lang.Runnable;

public class RunnableInter implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("My Child dream");
        }
    }
}

/**
 * InnerRunnableInter
 */
class A {
    public static void main(String[] args) {
        RunnableInter r = new RunnableInter();
        Thread t = new Thread(r);
        t.start();
        System.out.println("Main threa");
    }

}
