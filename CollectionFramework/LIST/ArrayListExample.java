package CollectionFramework.LIST;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        // 1. Create Data type input ArrayList 
        ArrayList<String> list = new ArrayList<>();
        // 2. add(E element)
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("add(): " + list);
        System.out.println("remove(): " + list.remove("Java"));
        // 3. add(index, element)
        list.add(1, "Spring Boot");
        System.out.println("add(index,element): " + list);
        // 4. get(index)
        System.out.println("get(): " + list.get(1));
        // 5. set(index, element)
        list.set(2, "React");
        System.out.println("set(): " + list);
        // 6. remove(index)
        list.remove(2);
        System.out.println("remove(index): " + list);
        // 7. remove(Object)
        list.remove("React");
        System.out.println("remove(Object): " + list);
        // 8. size()
        System.out.println("size(): " + list.size());
        // 9. contains()
        System.out.println("contains(Java): " + list.contains("Java"));
        // 10. indexOf()
        System.out.println("indexOf(Java): " + list.indexOf("Java"));
        // 11. lastIndexOf()
        list.add("Java");
        System.out.println("lastIndexOf(Java): " + list.lastIndexOf("Java"));

        // 12. isEmpty()
        System.out.println("isEmpty(): " + list.isEmpty());

        // 13. clone()
        ArrayList<String> copy = (ArrayList<String>) list.clone();
        System.out.println("clone(): " + copy);

        // 14. addAll()
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("HTML");
        list2.add("CSS");

        list.addAll(list2);
        System.out.println("addAll(): " + list);

        // 15. addAll(index, collection)
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("JavaScript");
        list3.add("NodeJS");

        list.addAll(2, list3);
        System.out.println("addAll(index): " + list);

        // 16. removeAll()
        list.removeAll(list2);
        System.out.println("removeAll(): " + list);
        list.remove("Java");
        System.out.println("remove()"+list);

        // 17. retainAll()
        ArrayList<String> retain = new ArrayList<>();
        retain.add("Java");
        retain.add("Spring Boot");

        list.retainAll(retain);
        System.out.println("retainAll(): " + list);

        // 18. clear()
        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        temp.add("B");

        temp.clear();
        System.out.println("clear(): " + temp);

        // 19. ensureCapacity()
        list.ensureCapacity(20);
        System.out.println("ensureCapacity() executed");

        // 20. trimToSize()
        list.trimToSize();
        System.out.println("trimToSize() executed");

        // 21. toArray()
        Object[] arr = list.toArray();

        System.out.print("toArray(): ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 22. Iterator
        System.out.println("Iterator:");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 23. forEach()
        System.out.println("forEach():");
        list.forEach(System.out::println);

        // 24. Collections.sort()
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        Collections.sort(numbers);
        System.out.println("sort(): " + numbers);

        // 25. Collections.reverse()
        Collections.reverse(numbers);
        System.out.println("reverse(): " + numbers);

        // 26. Collections.shuffle()
        Collections.shuffle(numbers);
        System.out.println("shuffle(): " + numbers);

        // 27. Collections.max()
        System.out.println("max(): " + Collections.max(numbers));

        // 28. Collections.min()
        System.out.println("min(): " + Collections.min(numbers));

        // 29. Collections.frequency()
        numbers.add(20);
        System.out.println("frequency(20): " + Collections.frequency(numbers, 20));

        // 30. Collections.binarySearch()
        Collections.sort(numbers);
        System.out.println("binarySearch(30): " + Collections.binarySearch(numbers, 30));
    }
}