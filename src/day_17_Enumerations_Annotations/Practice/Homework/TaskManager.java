package src.day_17_Enumerations_Annotations.Practice.Homework;

import java.lang.annotation.*;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@AuthorInfo(name = "Maleeran", created = "2025-08-11")
public class TaskManager {
    @AuthorInfo(name = "Jack", created = "2025-08-13")
    public static void main(String[] args) {
        // 创建一个任务列表
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("设计数据库", TaskStatus.TODO));
        tasks.add(new Task("编写API接口", TaskStatus.IN_PROGRESS));
        tasks.add(new Task("测试系统", TaskStatus.COMPLETED));
        tasks.add(new Task("部署上线", TaskStatus.TODO));

        // 使用switch语句处理任务
        for (Task task : tasks) {
            switch (task.getStatus()){
                case TODO:
                    System.out.println("待处理任务：" + task.getStatus());
                    break;
                case IN_PROGRESS:
                    System.out.println("进行中任务：" + task.getStatus());
                    break;
                case COMPLETED:
                    System.out.println("已完成任务：" + task.getStatus());
                    break;
                case CANCELED:
                    System.out.println("已取消任务：" + task.getStatus());
                    break;
            }
            task.printTasks();
            System.out.println("------------------");
        }

        // 使用反射处理任务
        printAuthorInfo(TaskManager.class);
        try {
            Method mainMethod = TaskManager.class.getMethod("main", String[].class);
            printAuthorInfo(mainMethod);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    // 打印注解信息的通用方法
    private static void printAuthorInfo(AnnotatedElement element) {
        if (element.isAnnotationPresent(AuthorInfo.class)) {
            AuthorInfo authorInfo = element.getAnnotation(AuthorInfo.class);
            System.out.println("\n作者信息:");
            System.out.println("名称: " + authorInfo.name());
            System.out.println("创建日期: " + authorInfo.created());
            System.out.println("来源: " + (element instanceof Class ? "类" : "方法") + "注解");
        }
    }
}
