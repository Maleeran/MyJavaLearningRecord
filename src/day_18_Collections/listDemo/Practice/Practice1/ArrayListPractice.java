package src.day_18_Collections.listDemo.Practice.Practice1;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("Beijing");
        list.add("Shanghai");
        list.add("Zhengzhou");
        list.add("Guangzhou");
        list.add("London");

        list.forEach(System.out::println);

        list.set(1,"New York");
        System.out.println("City List: " + list);
    }
}
