package CollectionFramework.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * LinkedListExample
 */
public class LinkedLIstExample {

    public static void main(String[] args) {

        // =========================================
        // Create Queue using LinkedList
        // =========================================
        Queue<Integer> queue = new LinkedList<>();

        // =========================================
        // add()
        // =========================================
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("add(): " + queue);

        // =========================================
        // offer()
        // =========================================
        queue.offer(40);
        queue.offer(50);

        System.out.println("offer(): " + queue);

        // =========================================
        // element()
        // =========================================
        System.out.println("\nelement(): " + queue.element());

        // =========================================
        // peek()
        // =========================================
        System.out.println("peek(): " + queue.peek());

        // =========================================
        // contains()
        // =========================================
        System.out.println("\ncontains(30): " + queue.contains(30));

        // =========================================
        // size()
        // =========================================
        System.out.println("size(): " + queue.size());

        // =========================================
        // isEmpty()
        // =========================================
        System.out.println("isEmpty(): " + queue.isEmpty());

        // =========================================
        // remove()
        // =========================================
        System.out.println("\nremove(): " + queue.remove());

        System.out.println("After remove(): " + queue);

        // =========================================
        // poll()
        // =========================================
        System.out.println("\npoll(): " + queue.poll());

        System.out.println("After poll(): " + queue);

        // =========================================
        // remove(Object)
        // =========================================
        queue.remove(Integer.valueOf(40));

        System.out.println("\nremove(Object): " + queue);

        // =========================================
        // addAll()
        // =========================================
        Queue<Integer> queue2 = new LinkedList<>();

        queue2.add(100);
        queue2.add(200);
        queue2.add(300);

        queue.addAll(queue2);

        System.out.println("\naddAll(): " + queue);

        // =========================================
        // containsAll()
        // =========================================
        System.out.println("\ncontainsAll(): " + queue.containsAll(queue2));

        // =========================================
        // removeAll()
        // =========================================
        queue.removeAll(queue2);

        System.out.println("\nremoveAll(): " + queue);

        // =========================================
        // retainAll()
        // =========================================
        Queue<Integer> queue3 = new LinkedList<>();

        queue3.add(30);

        queue.retainAll(queue3);

        System.out.println("\nretainAll(): " + queue);

        // =========================================
        // Iterator
        // =========================================
        System.out.println("\nIterator:");

        Iterator<Integer> itr = queue.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // =========================================
        // forEach()
        // =========================================
        System.out.println("\n\nforEach():");

        queue.forEach(x -> System.out.print(x + " "));

        // =========================================
        // toArray()
        // =========================================
        System.out.println("\n\ntoArray():");

        Object[] arr = queue.toArray();

        for (Object obj : arr) {
            System.out.print(obj + " ");
        }

        // =========================================
        // hashCode()
        // =========================================
        System.out.println("\n\nhashCode(): " + queue.hashCode());

        // =========================================
        // clone()
        // =========================================
        LinkedList<Integer> copy =
                new LinkedList<>((LinkedList<Integer>) queue);

        System.out.println("clone(): " + copy);

        // =========================================
        // equals()
        // =========================================
        System.out.println("equals(copy): " + queue.equals(copy));

        // =========================================
        // clear()
        // =========================================
        queue.clear();

        System.out.println("\nclear(): " + queue);

        System.out.println("isEmpty(): " + queue.isEmpty());
    }
}