package CollectionFramework.MAP;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMapExample
 */
public class TreeMapExample {

    public static void main(String[] args) {

        // =========================================
        // Create TreeMap
        // =========================================
        TreeMap<Integer, String> map = new TreeMap<>();

        // =========================================
        // put()
        // =========================================
        map.put(103, "Java");
        map.put(101, "Python");
        map.put(105, "React");
        map.put(102, "Spring Boot");
        map.put(104, "MySQL");

        System.out.println("put(): " + map);

        // =========================================
        // putIfAbsent()
        // =========================================
        map.putIfAbsent(106, "HTML");
        map.putIfAbsent(101, "CSS");

        System.out.println("\nputIfAbsent(): " + map);

        // =========================================
        // get()
        // =========================================
        System.out.println("\nget(103): " + map.get(103));

        // =========================================
        // getOrDefault()
        // =========================================
        System.out.println("getOrDefault(): "
                + map.getOrDefault(200, "Not Found"));

        // =========================================
        // containsKey()
        // =========================================
        System.out.println("\ncontainsKey(104): "
                + map.containsKey(104));

        // =========================================
        // containsValue()
        // =========================================
        System.out.println("containsValue(Java): "
                + map.containsValue("Java"));

        // =========================================
        // firstKey()
        // =========================================
        System.out.println("\nfirstKey(): " + map.firstKey());

        // =========================================
        // lastKey()
        // =========================================
        System.out.println("lastKey(): " + map.lastKey());

        // =========================================
        // higherKey()
        // =========================================
        System.out.println("higherKey(102): "
                + map.higherKey(102));

        // =========================================
        // lowerKey()
        // =========================================
        System.out.println("lowerKey(102): "
                + map.lowerKey(102));

        // =========================================
        // ceilingKey()
        // =========================================
        System.out.println("ceilingKey(102): "
                + map.ceilingKey(102));

        // =========================================
        // floorKey()
        // =========================================
        System.out.println("floorKey(102): "
                + map.floorKey(102));

        // =========================================
        // firstEntry()
        // =========================================
        System.out.println("\nfirstEntry(): "
                + map.firstEntry());

        // =========================================
        // lastEntry()
        // =========================================
        System.out.println("lastEntry(): "
                + map.lastEntry());

        // =========================================
        // pollFirstEntry()
        // =========================================
        System.out.println("\npollFirstEntry(): "
                + map.pollFirstEntry());

        // =========================================
        // pollLastEntry()
        // =========================================
        System.out.println("pollLastEntry(): "
                + map.pollLastEntry());

        System.out.println("After Poll: " + map);

        // =========================================
        // replace()
        // =========================================
        map.replace(103, "Java Full Stack");

        System.out.println("\nreplace(): " + map);

        // =========================================
        // remove()
        // =========================================
        map.remove(102);

        System.out.println("\nremove(): " + map);

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
        System.out.println("\nentrySet():");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(entry.getKey()
                    + " -> " + entry.getValue());
        }

        // =========================================
        // descendingMap()
        // =========================================
        System.out.println("\ndescendingMap(): "
                + map.descendingMap());

        // =========================================
        // headMap()
        // =========================================
        System.out.println("headMap(104): "
                + map.headMap(104));

        // =========================================
        // tailMap()
        // =========================================
        System.out.println("tailMap(103): "
                + map.tailMap(103));

        // =========================================
        // subMap()
        // =========================================
        System.out.println("subMap(103,106): "
                + map.subMap(103, 106));

        // =========================================
        // forEach()
        // =========================================
        System.out.println("\nforEach():");

        map.forEach((k, v) ->
                System.out.println(k + " : " + v));

        // =========================================
        // clone()
        // =========================================
        TreeMap<Integer, String> copy =
                (TreeMap<Integer, String>) map.clone();

        System.out.println("\nclone(): " + copy);

        // =========================================
        // equals()
        // =========================================
        System.out.println("equals(copy): "
                + map.equals(copy));

        // =========================================
        // hashCode()
        // =========================================
        System.out.println("hashCode(): "
                + map.hashCode());

        // =========================================
        // size()
        // =========================================
        System.out.println("\nsize(): " + map.size());

        // =========================================
        // isEmpty()
        // =========================================
        System.out.println("isEmpty(): " + map.isEmpty());

        // =========================================
        // putAll()
        // =========================================
        TreeMap<Integer, String> map2 = new TreeMap<>();

        map2.put(201, "Angular");
        map2.put(202, "React Native");

        map.putAll(map2);

        System.out.println("\nputAll(): " + map);

        // =========================================
        // clear()
        // =========================================
        map.clear();

        System.out.println("\nclear(): " + map);

        System.out.println("isEmpty(): " + map.isEmpty());

        // TreeMap does NOT allow null keys
        // map.put(null, "Java"); // NullPointerException
    }
}