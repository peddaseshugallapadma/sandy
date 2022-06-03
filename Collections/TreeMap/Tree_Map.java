package Java_Course.Collections.TreeMap;

import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "A");
        treeMap.put(2, "B");
        treeMap.put(1, "C");

        System.out.println(treeMap);
    }
}