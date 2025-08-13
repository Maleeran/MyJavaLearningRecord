package src.day_18_Collections.listDemo;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list.size());

        // 输出列表
        System.out.println("ArrayList: " + list);

        // 获取元素
        for (String fruit : list){
            System.out.println(fruit);
        }

        // 删除元素
        list.remove("Banana");
        System.out.println("ArrayList after removing Banana: " + list);
        System.out.println(list.size());
    }
}
