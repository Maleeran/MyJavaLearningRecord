package src.day_18_Collections.mapDemo;


import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        // 添加键值对
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 7);

        // 输出Map，按键排序
        System.out.println("TreeMap: " + map);

        // 遍历 TreeMap
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
