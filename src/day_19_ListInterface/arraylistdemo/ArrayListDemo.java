package src.day_19_ListInterface.arraylistdemo;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // 添加元素
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // 按索引插入
        fruits.add(1, "Mango");

        // 获取元素
        System.out.println("The first fruit: " + fruits.get(0));

        // 修改元素
        fruits.set(0, "Pear");

        // 删除元素
        fruits.remove(1);
        fruits.remove("Orange");
        System.out.println("ArrayList after removing: " + fruits);

        // 遍历
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
