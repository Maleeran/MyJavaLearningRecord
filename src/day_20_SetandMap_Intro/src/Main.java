package src.day_20_SetandMap_Intro.src;

import src.day_20_SetandMap_Intro.src.model.Student;
import src.day_20_SetandMap_Intro.src.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        // 添加学生
        studentService.addStudent(new Student("2024103001", "张三", 90));
        studentService.addStudent(new Student("2024103002", "李四", 80));
        studentService.addStudent(new Student("2024103003", "王五", 70));
        studentService.addStudent(new Student("2024103002", "李四四", 88));
        studentService.addStudent(new Student("2024103004", "赵六", 67));
        studentService.addStudent(new Student("2024103005", "孙七", 78));
        studentService.addStudent(new Student("2024103006", "周八", 89));
        studentService.addStudent(new Student("2024103007", "吴九", 98));

        // 遍历显示学生（Set）
        System.out.println("All Students(Set): ");
        studentService.displayAllStudents();

        // 遍历显示学生（Map）
        System.out.println("\nAll Students(Map): ");
        studentService.displayAllStudentsMap();

        // 查询学生
        System.out.println("\nQuery Student ID 2024103001: ");
        System.out.println(studentService.getStudentById("2024103001"));

        // 修改学生分数
        studentService.updateScore("2024103001", 95);
        System.out.println("\nUpdate Student Score for ID 2024103001: ");
        System.out.println(studentService.getStudentById("2024103001"));

        // 删除学生
        studentService.deleteStudent("2024103002");
        System.out.println("\nDelete Student ID 2024103002: ");
        studentService.displayAllStudents();

        // 测试统计方法
        double threshold = 80;
        int highScoreCount = studentService.countStudentsAboveScore(threshold);
        System.out.println("\nStudents above score " + threshold + ": " + highScoreCount);
    }
}
