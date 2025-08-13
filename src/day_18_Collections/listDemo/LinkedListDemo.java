package src.day_18_Collections.listDemo;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // 添加元素
        list.add("Maleeran");
        list.add("Jack");
        list.add("Mike");

        // 输出列表
        System.out.println("LinkedList: " + list);

        // 遍历列表
        for (String name : list){
            System.out.println(name);
        }

        list.forEach(name -> System.out.println(name));

        // 删除元素
        list.remove("Mike");
        System.out.println("LinkedList after removing Mike: " + list);
    }
}
