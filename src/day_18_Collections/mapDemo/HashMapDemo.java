package src.day_18_Collections.mapDemo;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 添加键值对
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 7);

        // 输出Map
        System.out.println("Map: " + map);

        // 遍历 Map
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // 如何输入key获取value
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // 如何输入value获取key
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 5) {
                System.out.println("Key for value 3: " + entry.getKey());
            }
        }
    }
}
