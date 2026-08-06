package CollectionFramework.QUEUE;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * ArrayDequeExample
 */
public class ArrayDequeExample {

    public static void main(String[] args) {

        // =========================================
        // Create ArrayDeque
        // =========================================
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // =========================================
        // add()
        // =========================================
        deque.add(10);
        deque.add(20);
        deque.add(30);

        System.out.println("add(): " + deque);

        // =========================================
        // addFirst()
        // =========================================
        deque.addFirst(5);
        System.out.println("addFirst(): " + deque);

        // =========================================
        // addLast()
        // =========================================
        deque.addLast(40);
        System.out.println("addLast(): " + deque);

        // =========================================
        // offer()
        // =========================================
        deque.offer(50);
        System.out.println("offer(): " + deque);

        // =========================================
        // offerFirst()
        // =========================================
        deque.offerFirst(1);
        System.out.println("offerFirst(): " + deque);

        // =========================================
        // offerLast()
        // =========================================
        deque.offerLast(60);
        System.out.println("offerLast(): " + deque);

        // =========================================
        // getFirst()
        // =========================================
        System.out.println("\ngetFirst(): " + deque.getFirst());

        // =========================================
        // getLast()
        // =========================================
        System.out.println("getLast(): " + deque.getLast());

        // =========================================
        // peek()
        // =========================================
        System.out.println("\npeek(): " + deque.peek());

        // =========================================
        // peekFirst()
        // =========================================
        System.out.println("peekFirst(): " + deque.peekFirst());

        // =========================================
        // peekLast()
        // =========================================
        System.out.println("peekLast(): " + deque.peekLast());

        // =========================================
        // element()
        // =========================================
        System.out.println("element(): " + deque.element());

        // =========================================
        // contains()
        // =========================================
        System.out.println("\ncontains(20): " + deque.contains(20));

        // =========================================
        // size()
        // =========================================
        System.out.println("size(): " + deque.size());

        // =========================================
        // isEmpty()
        // =========================================
        System.out.println("isEmpty(): " + deque.isEmpty());

        // =========================================
        // remove()
        // =========================================
        System.out.println("\nremove(): " + deque.remove());

        // =========================================
        // removeFirst()
        // =========================================
        System.out.println("removeFirst(): " + deque.removeFirst());

        // =========================================
        // removeLast()
        // =========================================
        System.out.println("removeLast(): " + deque.removeLast());

        System.out.println("After remove(): " + deque);

        // =========================================
        // poll()
        // =========================================
        System.out.println("\npoll(): " + deque.poll());

        // =========================================
        // pollFirst()
        // =========================================
        System.out.println("pollFirst(): " + deque.pollFirst());

        // =========================================
        // pollLast()
        // =========================================
        System.out.println("pollLast(): " + deque.pollLast());

        System.out.println("After poll(): " + deque);

        // =========================================
        // Add Again
        // =========================================
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(20);

        System.out.println("\nCurrent Deque: " + deque);

        // =========================================
        // removeFirstOccurrence()
        // =========================================
        deque.removeFirstOccurrence(20);

        System.out.println("removeFirstOccurrence(): " + deque);

        // =========================================
        // removeLastOccurrence()
        // =========================================
        deque.removeLastOccurrence(20);

        System.out.println("removeLastOccurrence(): " + deque);

        // =========================================
        // push()
        // =========================================
        deque.push(100);

        System.out.println("\npush(): " + deque);

        // =========================================
        // pop()
        // =========================================
        System.out.println("pop(): " + deque.pop());

        System.out.println("After pop(): " + deque);

        // =========================================
        // Iterator
        // =========================================
        System.out.println("\nIterator:");

        Iterator<Integer> itr = deque.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // =========================================
        // Descending Iterator
        // =========================================
        System.out.println("\n\nDescending Iterator:");

        Iterator<Integer> ditr = deque.descendingIterator();

        while (ditr.hasNext()) {
            System.out.print(ditr.next() + " ");
        }

        // =========================================
        // forEach()
        // =========================================
        System.out.println("\n\nforEach():");

        deque.forEach(x -> System.out.print(x + " "));

        // =========================================
        // toArray()
        // =========================================
        System.out.println("\n\ntoArray():");

        Object[] arr = deque.toArray();

        for (Object obj : arr) {
            System.out.print(obj + " ");
        }

        // =========================================
        // clear()
        // =========================================
        deque.clear();

        System.out.println("\n\nclear(): " + deque);

        System.out.println("isEmpty(): " + deque.isEmpty());
    }
}