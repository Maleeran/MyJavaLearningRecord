package src.day_23_customexception.src;

import src.day_23_customexception.src.model.Student;
import src.day_23_customexception.src.service.StudentService;
import src.day_23_customexception.src.exception.InvalidScoreException;
import src.day_23_customexception.src.exception.DuplicateIDException;
import src.day_23_customexception.src.exception.StudentNotFoundException;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        try{
            // 正常添加
            service.addStudent(new Student("2024103001", "张三", 90));
            service.addStudent(new Student("2024103002", "李四", 80));
            service.addStudent(new Student("2024103003", "王五", 70));
            service.addStudent(new Student("2024103003", "赵六", 60));
            service.removeStudent("2024103002"); // 删除存在的ID
            service.removeStudent("2024103004"); // 删除不存在的ID
            // 添加重复的ID
            service.addStudent(new Student("2024103002", "李四四", 88));
        }catch (DuplicateIDException e){
            System.out.println("Duplicate ID Error: " + e.getMessage());
        }catch (InvalidScoreException e){
            System.out.println("Invalid Score Error: " + e.getMessage());
        }catch (StudentNotFoundException e){
            System.out.println("Student Not Found Error: " + e.getMessage());
        }

        // 显示当前学生
        System.out.println("\n当前学生：");
        service.displayAllStudents();
    }
}
