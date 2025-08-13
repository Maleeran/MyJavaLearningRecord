package src.day_18_Collections.setDemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // 重复元素，会被忽略

        // 输出HashSet
        System.out.println("HashSet: "+ set);

        // 遍历HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
