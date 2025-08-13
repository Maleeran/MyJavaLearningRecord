package src.day_18_Collections.listDemo.Practice.Practice2;

import java.util.*;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // 添加元素，并确保没有重复
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Watermelon");
        set.add("Peach");

        // 输出HashSet
        set.forEach(fruit -> System.out.println(fruit));

    }
}
