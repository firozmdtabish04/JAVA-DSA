package CollectionFramework.SET;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSetExample
 */
public class TreeSetExample {

    public static void main(String[] args) {

        // =========================================
        // Create TreeSet
        // =========================================
        TreeSet<Integer> set = new TreeSet<>();

        // =========================================
        // add()
        // =========================================
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(50);
        set.add(40);
        set.add(20); // Duplicate ignored

        System.out.println("add(): " + set);

        // =========================================
        // contains()
        // =========================================
        System.out.println("\ncontains(20): " + set.contains(20));
        System.out.println("contains(100): " + set.contains(100));

        // =========================================
        // first()
        // =========================================
        System.out.println("\nfirst(): " + set.first());

        // =========================================
        // last()
        // =========================================
        System.out.println("last(): " + set.last());

        // =========================================
        // higher()
        // =========================================
        System.out.println("\nhigher(20): " + set.higher(20));

        // =========================================
        // lower()
        // =========================================
        System.out.println("lower(20): " + set.lower(20));

        // =========================================
        // ceiling()
        // =========================================
        System.out.println("ceiling(25): " + set.ceiling(25));

        // =========================================
        // floor()
        // =========================================
        System.out.println("floor(25): " + set.floor(25));

        // =========================================
        // pollFirst()
        // =========================================
        System.out.println("\npollFirst(): " + set.pollFirst());

        // =========================================
        // pollLast()
        // =========================================
        System.out.println("pollLast(): " + set.pollLast());

        System.out.println("After poll: " + set);

        // =========================================
        // addAll()
        // =========================================
        TreeSet<Integer> set2 = new TreeSet<>();

        set2.add(60);
        set2.add(70);
        set2.add(80);

        set.addAll(set2);

        System.out.println("\naddAll(): " + set);

        // =========================================
        // containsAll()
        // =========================================
        System.out.println("\ncontainsAll(): " + set.containsAll(set2));

        // =========================================
        // remove()
        // =========================================
        set.remove(70);

        System.out.println("\nremove(70): " + set);

        // =========================================
        // removeAll()
        // =========================================
        set.removeAll(set2);

        System.out.println("\nremoveAll(): " + set);

        // =========================================
        // retainAll()
        // =========================================
        TreeSet<Integer> set3 = new TreeSet<>();

        set3.add(20);
        set3.add(40);

        set.retainAll(set3);

        System.out.println("\nretainAll(): " + set);

        // =========================================
        // clone()
        // =========================================
        TreeSet<Integer> copy =
                (TreeSet<Integer>) set.clone();

        System.out.println("\nclone(): " + copy);

        // =========================================
        // iterator()
        // =========================================
        System.out.println("\nIterator:");

        Iterator<Integer> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // =========================================
        // descendingIterator()
        // =========================================
        System.out.println("\n\nDescending Iterator:");

        Iterator<Integer> ditr = set.descendingIterator();

        while (ditr.hasNext()) {
            System.out.print(ditr.next() + " ");
        }

        // =========================================
        // descendingSet()
        // =========================================
        System.out.println("\n\ndescendingSet(): " + set.descendingSet());

        // =========================================
        // headSet()
        // =========================================
        System.out.println("headSet(40): " + set.headSet(40));

        // =========================================
        // tailSet()
        // =========================================
        System.out.println("tailSet(20): " + set.tailSet(20));

        // =========================================
        // subSet()
        // =========================================
        System.out.println("subSet(20, 50): " + set.subSet(20, 50));

        // =========================================
        // size()
        // =========================================
        System.out.println("\nsize(): " + set.size());

        // =========================================
        // isEmpty()
        // =========================================
        System.out.println("isEmpty(): " + set.isEmpty());

        // =========================================
        // toArray()
        // =========================================
        Object[] arr = set.toArray();

        System.out.print("\ntoArray(): ");

        for (Object obj : arr) {
            System.out.print(obj + " ");
        }

        // =========================================
        // forEach()
        // =========================================
        System.out.println("\n\nforEach():");

        set.forEach(x -> System.out.print(x + " "));

        // =========================================
        // hashCode()
        // =========================================
        System.out.println("\n\nhashCode(): " + set.hashCode());

        // =========================================
        // equals()
        // =========================================
        System.out.println("equals(copy): " + set.equals(copy));

        // =========================================
        // Collections Methods
        // =========================================
        System.out.println("\nmax(): " + Collections.max(set));

        System.out.println("min(): " + Collections.min(set));

        System.out.println("frequency(20): " +
                Collections.frequency(set, 20));

        // =========================================
        // clear()
        // =========================================
        set.clear();

        System.out.println("\nclear(): " + set);

        System.out.println("isEmpty(): " + set.isEmpty());
    }
}