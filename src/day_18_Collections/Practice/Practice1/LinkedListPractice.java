package src.day_18_Collections.Practice.Practice1;

import java.util.*;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Nike");
        list.add("Adidas");
        list.add("Puma");

        // 原始列表
        System.out.println("Original Brand List : " + list);

        // 添加元素
        list.addFirst("Samsung");
        System.out.println("Added Brand List : " + list);

        // 删除元素
        list.remove(2);
        System.out.println("Removal Brand List : " + list);
    }
}
