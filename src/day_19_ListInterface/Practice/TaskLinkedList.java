package src.day_19_ListInterface.Practice;

import java.util.LinkedList;

public class TaskLinkedList {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.addFirst("Prior Task");

        // 依次取出任务并打印，满足 FIFO 规则
        while (!tasks.isEmpty()) {
            // 使用 poll() 方法取出队列头部的任务
            String task = tasks.poll();
            System.out.println("处理任务: " + task);
        }
    }
}
