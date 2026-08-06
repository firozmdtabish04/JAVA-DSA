package CollectionFramework.MAP;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * HashTableExample
 */
public class HashTableExample {

    public static void main(String[] args) {

        // =========================================
        // Create Hashtable
        // =========================================
        Hashtable<Integer, String> table = new Hashtable<>();

        // =========================================
        // put()
        // =========================================
        table.put(101, "Java");
        table.put(102, "Python");
        table.put(103, "C++");
        table.put(104, "React");

        System.out.println("put(): " + table);

        // =========================================
        // putIfAbsent()
        // =========================================
        table.putIfAbsent(105, "Spring Boot");
        table.putIfAbsent(101, "HTML");

        System.out.println("\nputIfAbsent(): " + table);

        // =========================================
        // get()
        // =========================================
        System.out.println("\nget(102): " + table.get(102));

        // =========================================
        // getOrDefault()
        // =========================================
        System.out.println("getOrDefault(): "
                + table.getOrDefault(110, "Not Found"));

        // =========================================
        // containsKey()
        // =========================================
        System.out.println("\ncontainsKey(103): "
                + table.containsKey(103));

        // =========================================
        // containsValue()
        // =========================================
        System.out.println("containsValue(Java): "
                + table.containsValue("Java"));

        // =========================================
        // size()
        // =========================================
        System.out.println("\nsize(): " + table.size());

        // =========================================
        // isEmpty()
        // =========================================
        System.out.println("isEmpty(): " + table.isEmpty());

        // =========================================
        // replace()
        // =========================================
        table.replace(103, "NodeJS");

        System.out.println("\nreplace(): " + table);

        // =========================================
        // replace(key, oldValue, newValue)
        // =========================================
        table.replace(102, "Python", "Django");

        System.out.println("replace(old,new): " + table);

        // =========================================
        // remove(key)
        // =========================================
        table.remove(104);

        System.out.println("\nremove(key): " + table);

        // =========================================
        // remove(key,value)
        // =========================================
        table.remove(105, "Spring Boot");

        System.out.println("remove(key,value): " + table);

        // =========================================
        // keySet()
        // =========================================
        Set<Integer> keys = table.keySet();

        System.out.println("\nkeySet(): " + keys);

        // =========================================
        // values()
        // =========================================
        Collection<String> values = table.values();

        System.out.println("values(): " + values);

        // =========================================
        // entrySet()
        // =========================================
        Set<Map.Entry<Integer, String>> entries = table.entrySet();

        System.out.println("\nentrySet():");

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // =========================================
        // forEach()
        // =========================================
        System.out.println("\nforEach():");

        table.forEach((key, value) ->
                System.out.println(key + " : " + value));

        // =========================================
        // clone()
        // =========================================
        Hashtable<Integer, String> copy =
                (Hashtable<Integer, String>) table.clone();

        System.out.println("\nclone(): " + copy);

        // =========================================
        // equals()
        // =========================================
        System.out.println("\nequals(copy): "
                + table.equals(copy));

        // =========================================
        // hashCode()
        // =========================================
        System.out.println("hashCode(): "
                + table.hashCode());

        // =========================================
        // putAll()
        // =========================================
        Hashtable<Integer, String> table2 =
                new Hashtable<>();

        table2.put(201, "HTML");
        table2.put(202, "CSS");

        table.putAll(table2);

        System.out.println("\nputAll(): " + table);

        // =========================================
        // clear()
        // =========================================
        table.clear();

        System.out.println("\nclear(): " + table);

        // =========================================
        // isEmpty()
        // =========================================
        System.out.println("isEmpty(): " + table.isEmpty());

        // =========================================
        // Note: Hashtable does NOT allow null
        // Uncommenting the below lines throws
        // NullPointerException
        // =========================================

        // table.put(null, "Java");
        // table.put(1, null);
    }
}