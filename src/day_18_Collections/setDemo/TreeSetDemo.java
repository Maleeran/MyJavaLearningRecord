package src.day_18_Collections.setDemo;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 添加元素
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(50);
        treeSet.add(3);

        // 输出集合, 自动排序
        System.out.println("TreeSet: " + treeSet);

        System.out.println(treeSet.first());

        // 遍历集合
        for (Integer i : treeSet){
            System.out.println(i);
        }

        treeSet.forEach(System.out ::println);
    }
}
