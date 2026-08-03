package OOPsConcept.Abstraction;

abstract class Person {

    // Abstract method (no body)
    abstract void work();

    // Normal method
    void sleep() {
        System.out.println("Person is sleeping.");
    }
}

class Father extends Person {

    @Override
    void work() {
        System.out.println("Father is working.");
    }
}

public class Main {
    public static void main(String[] args) {

        Person p = new Father();

        p.work();
        p.sleep();
    }
}
