package src.day_19_ListInterface.linkedlistdemo;

import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        // 添加元素
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        queue.addFirst("Urgent Task");
        queue.addLast("Low Priority Task");

        // 获取元素
        System.out.println("The first task: " + queue.getFirst());
        System.out.println("The last task: " + queue.getLast());

        // 删除元素
        queue.removeFirst();
        queue.removeLast();

        // 遍历
        for(String Task: queue){
            System.out.println(Task);
        }
    }
}
