package CollectionFramework.MAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMapExample
 */
public class HashMapExample {

    public static void main(String[] args) {

        // =========================================
        // Create HashMap
        // =========================================
        HashMap<Integer, String> map = new HashMap<>();

        // =========================================
        // put()
        // =========================================
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");
        map.put(104, "React");

        System.out.println("put(): " + map);

        // =========================================
        // putIfAbsent()
        // =========================================
        map.putIfAbsent(105, "Spring Boot");
        map.putIfAbsent(101, "HTML");

        System.out.println("\nputIfAbsent(): " + map);

        // =========================================
        // get()
        // =========================================
        System.out.println("\nget(102): " + map.get(102));

        // =========================================
        // getOrDefault()
        // =========================================
        System.out.println("getOrDefault(): " + map.getOrDefault(110, "Not Found"));

        // =========================================
        // containsKey()
        // =========================================
        System.out.println("\ncontainsKey(103): "
                + map.containsKey(103));

        // =========================================
        // containsValue()
        // =========================================
        System.out.println("containsValue(Java): "
                + map.containsValue("Java"));

        // =========================================
        // size()
        // =========================================
        System.out.println("\nsize(): " + map.size());

        // =========================================
        // isEmpty()
        // =========================================
        System.out.println("isEmpty(): " + map.isEmpty());

        // =========================================
        // replace()
        // =========================================
        map.replace(103, "NodeJS");

        System.out.println("\nreplace(): " + map);

        // =========================================
        // replace(key, oldValue, newValue)
        // =========================================
        map.replace(102, "Python", "Django");

        System.out.println("replace(old,new): " + map);

        // =========================================
        // remove(key)
        // =========================================
        map.remove(104);

        System.out.println("\nremove(key): " + map);

        // =========================================
        // remove(key,value)
        // =========================================
        map.remove(105, "Spring Boot");

        System.out.println("remove(key,value): " + map);

        // =========================================
        // keySet()
        // =========================================
        Set<Integer> keys = map.keySet();

        System.out.println("\nkeySet(): " + keys);

        // =========================================
        // values()
        // =========================================
        Collection<String> values = map.values();

        System.out.println("values(): " + values);

        // =========================================
        // entrySet()
        // =========================================
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        System.out.println("\nentrySet():");

        for (Map.Entry<Integer, String> entry : entries) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // =========================================
        // forEach()
        // =========================================
        System.out.println("\nforEach():");

        map.forEach((key, value) -> System.out.println(key + " : " + value));

        // =========================================
        // clone()
        // =========================================
        HashMap<Integer, String> copy = (HashMap<Integer, String>) map.clone();

        System.out.println("\nclone(): " + copy);

        // =========================================
        // equals()
        // =========================================
        System.out.println("\nequals(copy): "
                + map.equals(copy));

        // =========================================
        // hashCode()
        // =========================================
        System.out.println("hashCode(): "
                + map.hashCode());

        // =========================================
        // putAll()
        // =========================================
        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(201, "HTML");
        map2.put(202, "CSS");

        map.putAll(map2);

        System.out.println("\nputAll(): " + map);

        // =========================================
        // clear()
        // =========================================
        map.clear();

        System.out.println("\nclear(): " + map);

        // =========================================
        // isEmpty()
        // =========================================
        System.out.println("isEmpty(): " + map.isEmpty());
    }
}