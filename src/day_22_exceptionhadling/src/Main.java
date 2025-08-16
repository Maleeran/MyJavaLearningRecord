package src.day_22_exceptionhadling.src;

import src.day_22_exceptionhadling.src.model.Student;
import src.day_22_exceptionhadling.src.util.FileHandler;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        String filePath = "src/day_22_exceptionhadling/Student.txt";

        // 准备测试数据
        Map<String, Student> students = new HashMap<>();
        students.put("s001", new Student("s001", "张三", 90));
        students.put("s002", new Student("s002", "李四", 80));

        try{
//            // 写入学生数据
//            fileHandler.writeStudents(filePath, students);
//            System.out.println("数据写入成功！");

            // 读取学生数据
            Map<String, Student> readStudents = fileHandler.readStudents(filePath);
            System.out.println("数据读取成功！");

            // 输出读取到的数据
            for(Map.Entry<String, Student> entry : readStudents.entrySet()){
                System.out.println("学号：" + entry.getKey() + ", 姓名：" + entry.getValue().getName() + ", 分数：" + entry.getValue().getScore());
            }
        }catch (Exception e){
            System.out.println("发生异常：" + e.getMessage());
        }
    }
}
