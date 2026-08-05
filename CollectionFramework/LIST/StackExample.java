package CollectionFramework.LIST;

import java.util.Stack;

/**
 * StackExample
 */
public class StackExample {

    public static void main(String[] args) {

        // ==============================
        // Create Stack
        // ==============================
        Stack<Integer> stack = new Stack<>();

        // ==============================
        // push()
        // ==============================
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("After push(): " + stack);

        // ==============================
        // peek()
        // ==============================
        System.out.println("\npeek(): " + stack.peek());

        // ==============================
        // pop()
        // ==============================
        System.out.println("\npop(): " + stack.pop());
        System.out.println("After pop(): " + stack);

        // ==============================
        // search()
        // ==============================
        System.out.println("\nsearch(30): " + stack.search(30));
        System.out.println("search(100): " + stack.search(100));

        // ==============================
        // size()
        // ==============================
        System.out.println("\nsize(): " + stack.size());

        // ==============================
        // isEmpty()
        // ==============================
        System.out.println("\nisEmpty(): " + stack.isEmpty());

        // ==============================
        // contains()
        // ==============================
        System.out.println("\ncontains(20): " + stack.contains(20));

        // ==============================
        // get(index)
        // ==============================
        System.out.println("\nget(1): " + stack.get(1));

        // ==============================
        // set(index, element)
        // ==============================
        stack.set(1, 100);

        System.out.println("\nset(): " + stack);

        // ==============================
        // add()
        // ==============================
        stack.add(60);

        System.out.println("\nadd(): " + stack);

        // ==============================
        // add(index, element)
        // ==============================
        stack.add(2, 200);

        System.out.println("\nadd(index): " + stack);

        // ==============================
        // remove(index)
        // ==============================
        stack.remove(2);

        System.out.println("\nremove(index): " + stack);

        // ==============================
        // remove(Object)
        // ==============================
        stack.remove(Integer.valueOf(60));

        System.out.println("\nremove(Object): " + stack);

        // ==============================
        // firstElement()
        // ==============================
        System.out.println("\nfirstElement(): " + stack.firstElement());

        // ==============================
        // lastElement()
        // ==============================
        System.out.println("lastElement(): " + stack.lastElement());

        // ==============================
        // clone()
        // ==============================
        Stack<Integer> copy = (Stack<Integer>) stack.clone();

        System.out.println("\nclone(): " + copy);

        // ==============================
        // iterator()
        // ==============================
        System.out.println("\nIterator:");

        for (Integer value : stack) {
            System.out.print(value + " ");
        }

        // ==============================
        // clear()
        // ==============================
        copy.clear();

        System.out.println("\n\nclear(): " + copy);

        // ==============================
        // empty()
        // ==============================
        System.out.println("\nempty(): " + copy.empty());
    }
}