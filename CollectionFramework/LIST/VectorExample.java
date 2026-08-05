package CollectionFramework.LIST;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * VectorExample
 */
public class VectorExample {

    public static void main(String[] args) {

        // ==============================
        // Create Vector
        // ==============================
        Vector<Integer> vector = new Vector<>();

        // ==============================
        // add()
        // ==============================
        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println("add(): " + vector);

        // ==============================
        // add(index, element)
        // ==============================
        vector.add(1, 15);
        System.out.println("add(index): " + vector);

        // ==============================
        // addElement()
        // ==============================
        vector.addElement(40);
        System.out.println("addElement(): " + vector);

        // ==============================
        // get()
        // ==============================
        System.out.println("\nget(2): " + vector.get(2));

        // ==============================
        // firstElement()
        // ==============================
        System.out.println("firstElement(): " + vector.firstElement());

        // ==============================
        // lastElement()
        // ==============================
        System.out.println("lastElement(): " + vector.lastElement());

        // ==============================
        // set()
        // ==============================
        vector.set(1, 100);
        System.out.println("\nset(): " + vector);

        // ==============================
        // setElementAt()
        // ==============================
        vector.setElementAt(200, 2);
        System.out.println("setElementAt(): " + vector);

        // ==============================
        // contains()
        // ==============================
        System.out.println("\ncontains(30): " + vector.contains(30));

        // ==============================
        // indexOf()
        // ==============================
        System.out.println("indexOf(40): " + vector.indexOf(40));

        // ==============================
        // lastIndexOf()
        // ==============================
        vector.add(40);

        System.out.println("lastIndexOf(40): " + vector.lastIndexOf(40));

        // ==============================
        // size()
        // ==============================
        System.out.println("\nsize(): " + vector.size());

        // ==============================
        // capacity()
        // ==============================
        System.out.println("capacity(): " + vector.capacity());

        // ==============================
        // ensureCapacity()
        // ==============================
        vector.ensureCapacity(20);
        System.out.println("ensureCapacity(): " + vector.capacity());

        // ==============================
        // trimToSize()
        // ==============================
        vector.trimToSize();
        System.out.println("trimToSize(): " + vector.capacity());

        // ==============================
        // isEmpty()
        // ==============================
        System.out.println("\nisEmpty(): " + vector.isEmpty());

        // ==============================
        // remove(index)
        // ==============================
        vector.remove(1);
        System.out.println("\nremove(index): " + vector);

        // ==============================
        // remove(Object)
        // ==============================
        vector.remove(Integer.valueOf(40));
        System.out.println("remove(Object): " + vector);

        // ==============================
        // removeElement()
        // ==============================
        vector.removeElement(40);
        System.out.println("removeElement(): " + vector);

        // ==============================
        // insertElementAt()
        // ==============================
        vector.insertElementAt(500, 1);
        System.out.println("insertElementAt(): " + vector);

        // ==============================
        // removeElementAt()
        // ==============================
        vector.removeElementAt(1);
        System.out.println("removeElementAt(): " + vector);

        // ==============================
        // clone()
        // ==============================
        Vector<Integer> copy = (Vector<Integer>) vector.clone();
        System.out.println("\nclone(): " + copy);

        // ==============================
        // toArray()
        // ==============================
        Object[] arr = vector.toArray();

        System.out.print("\ntoArray(): ");

        for (Object x : arr) {
            System.out.print(x + " ");
        }

        // ==============================
        // Iterator
        // ==============================
        System.out.println("\n\nIterator:");

        Iterator<Integer> itr = vector.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // ==============================
        // Enumeration
        // ==============================
        System.out.println("\n\nEnumeration:");

        Enumeration<Integer> en = vector.elements();

        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }

        // ==============================
        // forEach
        // ==============================
        System.out.println("\n\nforEach():");

        vector.forEach(x -> System.out.print(x + " "));

        // ==============================
        // Collections Methods
        // ==============================
        Collections.sort(vector);
        System.out.println("\n\nsort(): " + vector);

        Collections.reverse(vector);
        System.out.println("reverse(): " + vector);

        Collections.shuffle(vector);
        System.out.println("shuffle(): " + vector);

        System.out.println("max(): " + Collections.max(vector));

        System.out.println("min(): " + Collections.min(vector));

        System.out.println("frequency(10): " +
                Collections.frequency(vector, 10));

        Collections.swap(vector, 0, 1);
        System.out.println("swap(): " + vector);

        Collections.rotate(vector, 2);
        System.out.println("rotate(): " + vector);

        Collections.replaceAll(vector, 10, 1000);
        System.out.println("replaceAll(): " + vector);

        // ==============================
        // clear()
        // ==============================
        vector.clear();

        System.out.println("\nclear(): " + vector);

        System.out.println("isEmpty(): " + vector.isEmpty());
    }
}