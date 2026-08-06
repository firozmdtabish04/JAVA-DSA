package CollectionFramework.QUEUE;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * PriorityQueueExample
 */
public class PriorityQueueExample {

    public static void main(String[] args) {

        // =========================================
        // Create PriorityQueue
        // =========================================
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // =========================================
        // add()
        // =========================================
        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(50);
        queue.add(40);

        System.out.println("add(): " + queue);

        // =========================================
        // offer()
        // =========================================
        queue.offer(60);

        System.out.println("offer(): " + queue);

        // =========================================
        // peek()
        // =========================================
        System.out.println("\npeek(): " + queue.peek());

        // =========================================
        // element()
        // =========================================
        System.out.println("element(): " + queue.element());

        // =========================================
        // contains()
        // =========================================
        System.out.println("\ncontains(20): " + queue.contains(20));

        // =========================================
        // size()
        // =========================================
        System.out.println("size(): " + queue.size());

        // =========================================
        // isEmpty()
        // =========================================
        System.out.println("isEmpty(): " + queue.isEmpty());

        // =========================================
        // poll()
        // =========================================
        System.out.println("\npoll(): " + queue.poll());

        System.out.println("After poll(): " + queue);

        // =========================================
        // remove()
        // =========================================
        System.out.println("\nremove(): " + queue.remove());

        System.out.println("After remove(): " + queue);

        // =========================================
        // remove(Object)
        // =========================================
        queue.remove(Integer.valueOf(40));

        System.out.println("\nremove(Object): " + queue);

        // =========================================
        // addAll()
        // =========================================
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();

        queue2.add(70);
        queue2.add(80);
        queue2.add(90);

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
        PriorityQueue<Integer> queue3 = new PriorityQueue<>();

        queue3.add(20);
        queue3.add(50);

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
        // equals()
        // =========================================
        PriorityQueue<Integer> copy = new PriorityQueue<>(queue);

        System.out.println("equals(copy): " + queue.equals(copy));

        // =========================================
        // Collections Methods
        // =========================================
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);

        System.out.println("\nmax(): " + Collections.max(numbers));

        System.out.println("min(): " + Collections.min(numbers));

        System.out.println("frequency(20): "
                + Collections.frequency(numbers, 20));

        // =========================================
        // clear()
        // =========================================
        queue.clear();

        System.out.println("\nclear(): " + queue);

        System.out.println("isEmpty(): " + queue.isEmpty());
    }
}