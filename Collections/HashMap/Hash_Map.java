package Java_Course.Collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hash_Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println("Size of map is: " + map.size()); // Size of map is: 3
        System.out.println(map); // {a=10, b=20, c=30}

        if (map.containsKey("a")) {
            Integer a = map.get("a");
            System.out.println("Value for key" + " \"a\" is: " + a); // Value for key "a" is: 10
        }

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));

            // Output
            // key: a, Value: 10
            // key: b, Value: 20
            // key: c, Value: 30
        }

        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key - " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}