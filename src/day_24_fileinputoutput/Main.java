package src.day_24_fileinputoutput;

import src.day_24_fileinputoutput.src.model.Student;
import src.day_24_fileinputoutput.src.exception.FileOperationException;
import src.day_24_fileinputoutput.src.util.FileManager;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/day_24_fileinputoutput/students.txt";
        FileManager fileManager = new FileManager(filePath);

        // 初始化测试数据并写入
//        Map<String, Student> initialStudents = new HashMap<>();
//        initialStudents.put("s001", new Student("张三", "s001", 90.0));
//        initialStudents.put("s002", new Student("李四", "s002", 98.0));
//        initialStudents.put("s003", new Student("王五", "s003", 85.0));
//        initialStudents.put("s004", new Student("赵六", "s004", 75.0));
//        try{
//            fileManager.writeStudents(initialStudents);
//            System.out.println("初始数据写入成功");
//        }catch (FileOperationException e){
//            System.out.println("初始数据写入失败：" + e.getMessage());
//        }

        try{
            Map<String, Student> students = fileManager.readStudents();
            System.out.println("读取数据成功：");
            for (Student student : students.values()){
                System.out.println(student);
            }
        }catch(FileOperationException e){
            System.out.println("读取数据失败：" + e.getMessage());
        }

        // 更新学生成绩
        try{
            fileManager.updateStudentScore("s005", 98.0);
            Map<String, Student> updatedStudents = fileManager.readStudents();
            System.out.println("更新数据成功：");
            for (Student student : updatedStudents.values()){
                System.out.println(student);
            }
        }catch (FileOperationException e){
            System.out.println("更新数据失败：" + e.getMessage());
        }
    }
}
