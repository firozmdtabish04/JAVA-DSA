package CollectionFramework.SET;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * LinkedHashSetExample
 */
public class LinkedHashSetExample {

    public static void main(String[] args) {

        // =========================================
        // Create LinkedHashSet
        // =========================================
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // =========================================
        // add()
        // =========================================
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20); // Duplicate ignored

        System.out.println("add(): " + set);

        // =========================================
        // contains()
        // =========================================
        System.out.println("\ncontains(20): " + set.contains(20));
        System.out.println("contains(100): " + set.contains(100));

        // =========================================
        // size()
        // =========================================
        System.out.println("\nsize(): " + set.size());

        // =========================================
        // isEmpty()
        // =========================================
        System.out.println("isEmpty(): " + set.isEmpty());

        // =========================================
        // remove()
        // =========================================
        set.remove(30);

        System.out.println("\nremove(30): " + set);

        // =========================================
        // addAll()
        // =========================================
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        set2.add(50);
        set2.add(60);
        set2.add(70);

        set.addAll(set2);

        System.out.println("\naddAll(): " + set);

        // =========================================
        // containsAll()
        // =========================================
        System.out.println("\ncontainsAll(): " + set.containsAll(set2));

        // =========================================
        // removeAll()
        // =========================================
        set.removeAll(set2);

        System.out.println("\nremoveAll(): " + set);

        // =========================================
        // retainAll()
        // =========================================
        LinkedHashSet<Integer> set3 = new LinkedHashSet<>();

        set3.add(10);
        set3.add(40);

        set.retainAll(set3);

        System.out.println("\nretainAll(): " + set);

        // =========================================
        // clone()
        // =========================================
        LinkedHashSet<Integer> copy =
                (LinkedHashSet<Integer>) set.clone();

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
        // forEach()
        // =========================================
        System.out.println("\n\nforEach():");

        set.forEach(x -> System.out.print(x + " "));

        // =========================================
        // toArray()
        // =========================================
        System.out.println("\n\ntoArray():");

        Object[] arr = set.toArray();

        for (Object obj : arr) {
            System.out.print(obj + " ");
        }

        // =========================================
        // hashCode()
        // =========================================
        System.out.println("\n\nhashCode(): " + set.hashCode());

        // =========================================
        // equals()
        // =========================================
        System.out.println("equals(copy): " + set.equals(copy));

        // =========================================
        // Collections Utility Methods
        // =========================================
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(40);

        System.out.println("\nNumbers: " + numbers);

        System.out.println("max(): " + Collections.max(numbers));

        System.out.println("min(): " + Collections.min(numbers));

        System.out.println("frequency(20): "
                + Collections.frequency(numbers, 20));

        // =========================================
        // clear()
        // =========================================
        numbers.clear();

        System.out.println("\nclear(): " + numbers);

        System.out.println("isEmpty(): " + numbers.isEmpty());
    }
}