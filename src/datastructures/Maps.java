package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

/**
 * Created by patrick.duff on 11/9/2018.
 */
public class Maps {

    public static void main(String[] args) {
        //Implement map interfaces
        Map<Integer, String> hMap = new HashMap<>();
        Map<Integer, String> tmap = new TreeMap<>();
        Map<Integer, String > lHMap = new LinkedHashMap<>();
        hashMapUtil(hMap);
        treeMapUtil(tmap);
        linkedMapUtil(lHMap);

    }

    public static void hashMapUtil(Map<Integer, String> map) {
        // 1. add key/value pairs
        map.put(101, "Steve");
        map.put(500, "Roger");
        map.put(22, "Jennifer");
        map.put(300, "Mika");
        map.put(750, "Melinda");

        // 2. Expose/access elements
        System.out.println("\nSee all " + map.size() + " of the keys: " + map.keySet());
        System.out.println("See all key/value pairs: " + map);

        // 3. Iterate through map of key/value pairs
        for (int key : map.keySet()) {
            System.out.println("[KEY: " + key + ". VALUE: " + map.get(key) + "]");
        }

    }

    public static void treeMapUtil(Map<Integer, String > map) {
        // 1. add key/value pairs
        map.put(101, "Steve");
        map.put(500, "Roger");
        map.put(22, "Jennifer");
        map.put(300, "Mika");
        map.put(750, "Melinda");

        // 2. Expose/access elements
        System.out.println("\nSee all " + map.size() + " of the keys: " + map.keySet());
        System.out.println("See all key/value pairs: " + map);

        // 3. Iterate through map of key/value pairs
        for (int key : map.keySet()) {
            System.out.println("[KEY: " + key + ". VALUE: " + map.get(key) + "]");
        }
    }

    public static void linkedMapUtil(Map<Integer, String > map) {
        // 1. add key/value pairs
        map.put(101, "Steve");
        map.put(500, "Roger");
        map.put(22, "Jennifer");
        map.put(300, "Mika");
        map.put(750, "Melinda");

        // 2. Expose/access elements
        System.out.println("\nSee all " + map.size() + " of the keys: " + map.keySet());
        System.out.println("See all key/value pairs: " + map);

        // 3. Iterate through map of key/value pairs
        for (int key : map.keySet()) {
            System.out.println("[KEY: " + key + ". VALUE: " + map.get(key) + "]");
        }
    }

}
