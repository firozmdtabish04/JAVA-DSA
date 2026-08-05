package CollectionFramework.LIST;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {

        // ==============================
        // Create LinkedList
        // ==============================
        LinkedList<Integer> list = new LinkedList<>();

        // ==============================
        // Add Methods
        // ==============================
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("add(): " + list);

        list.add(1, 15);
        System.out.println("add(index, element): " + list);

        list.addFirst(5);
        System.out.println("addFirst(): " + list);

        list.addLast(40);
        System.out.println("addLast(): " + list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(50);
        list2.add(60);

        list.addAll(list2);
        System.out.println("addAll(): " + list);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(100);
        list3.add(200);

        list.addAll(2, list3);
        System.out.println("addAll(index): " + list);

        // ==============================
        // Get Methods
        // ==============================
        System.out.println("\nget(3): " + list.get(3));
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());

        // ==============================
        // Peek Methods
        // ==============================
        System.out.println("\npeek(): " + list.peek());
        System.out.println("peekFirst(): " + list.peekFirst());
        System.out.println("peekLast(): " + list.peekLast());

        // ==============================
        // Element Method
        // ==============================
        System.out.println("\nelement(): " + list.element());

        // ==============================
        // Set Method
        // ==============================
        list.set(2, 111);
        System.out.println("\nset(): " + list);

        // ==============================
        // Search Methods
        // ==============================
        System.out.println("\ncontains(20): " + list.contains(20));
        System.out.println("indexOf(20): " + list.indexOf(20));
        System.out.println("lastIndexOf(20): " + list.lastIndexOf(20));
        System.out.println("size(): " + list.size());
        System.out.println("isEmpty(): " + list.isEmpty());

        // ==============================
        // Queue Methods
        // ==============================
        list.offer(500);
        list.offerFirst(1);
        list.offerLast(999);

        System.out.println("\nAfter offer methods: " + list);

        System.out.println("poll(): " + list.poll());
        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println("pollLast(): " + list.pollLast());

        System.out.println("After poll methods: " + list);

        // ==============================
        // Stack Methods
        // ==============================
        list.push(1000);
        list.push(2000);

        System.out.println("\nAfter push(): " + list);

        System.out.println("pop(): " + list.pop());

        System.out.println("After pop(): " + list);

        // ==============================
        // Remove Methods
        // ==============================
        list.remove();
        System.out.println("\nremove(): " + list);

        list.remove(2);
        System.out.println("remove(index): " + list);

        list.remove(Integer.valueOf(20));
        System.out.println("remove(Object): " + list);

        list.add(50);
        list.add(50);

        System.out.println("\nBefore remove occurrence: " + list);

        list.removeFirstOccurrence(50);
        System.out.println("removeFirstOccurrence(): " + list);

        list.removeLastOccurrence(50);
        System.out.println("removeLastOccurrence(): " + list);

        // ==============================
        // Clone
        // ==============================
        LinkedList<Integer> copy =
                (LinkedList<Integer>) list.clone();

        System.out.println("\nclone(): " + copy);

        // ==============================
        // Iterator
        // ==============================
        System.out.println("\nIterator:");

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // ==============================
        // Descending Iterator
        // ==============================
        System.out.println("\n\nDescending Iterator:");

        Iterator<Integer> ditr =
                list.descendingIterator();

        while (ditr.hasNext()) {
            System.out.print(ditr.next() + " ");
        }

        // ==============================
        // ListIterator
        // ==============================
        System.out.println("\n\nListIterator:");

        ListIterator<Integer> litr =
                list.listIterator();

        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }

        // ==============================
        // forEach
        // ==============================
        System.out.println("\n\nforEach():");

        list.forEach(x -> System.out.print(x + " "));

        // ==============================
        // toArray
        // ==============================
        System.out.println("\n\ntoArray():");

        Object[] arr = list.toArray();

        for (Object x : arr) {
            System.out.print(x + " ");
        }

        // ==============================
        // Collections Methods
        // ==============================
        LinkedList<Integer> numbers =
                new LinkedList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);

        System.out.println("\n\nOriginal Numbers: " + numbers);

        Collections.sort(numbers);
        System.out.println("sort(): " + numbers);

        Collections.reverse(numbers);
        System.out.println("reverse(): " + numbers);

        Collections.shuffle(numbers);
        System.out.println("shuffle(): " + numbers);

        System.out.println("max(): " + Collections.max(numbers));

        System.out.println("min(): " + Collections.min(numbers));

        System.out.println("frequency(20): "
                + Collections.frequency(numbers, 20));

        Collections.swap(numbers, 0, 2);
        System.out.println("swap(): " + numbers);

        Collections.rotate(numbers, 2);
        System.out.println("rotate(): " + numbers);

        Collections.replaceAll(numbers, 20, 200);
        System.out.println("replaceAll(): " + numbers);

        Collections.fill(numbers, 999);
        System.out.println("fill(): " + numbers);

        // ==============================
        // Clear
        // ==============================
        numbers.clear();

        System.out.println("\nclear(): " + numbers);

        System.out.println("isEmpty(): " + numbers.isEmpty());
    }
}