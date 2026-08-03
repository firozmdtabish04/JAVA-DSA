package OOPsConcept.Polymorphism;

class Person {
    void role() {
        System.out.println("I am a person.");
    }
}

class Father extends Person {

    // Method Overriding
    @Override
    void role() {
        System.out.println("I am a father.");
    }

    // Method Overloading
    void role(String name) {
        System.out.println("I am a father. My name is " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism (Overriding)
        Person p = new Father();
        p.role();

        // Compile-time Polymorphism (Overloading)
        Father f = new Father();
        f.role();
        f.role("Ramesh");
    }
}