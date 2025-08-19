package src.day_25_scannerclass.src.util;

import src.day_25_scannerclass.src.model.Student;
import src.day_25_scannerclass.src.exception.InputException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManager {
    private Map<String, Student> students = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent()throws InputException{
        System.out.println("请输入学号：");
        String id = sc.next();
//        String id = sc.nextLine().trim();
        if (id.isEmpty())throw new InputException("学号不能为空");

        System.out.println("请输入姓名：");
        String name = sc.next();
//        String name = sc.nextLine().trim();
        if(name.isEmpty())throw new InputException("姓名不能为空");

        System.out.println("请输入成绩：");
        if(!sc.hasNextDouble()){
            sc.next() ; // 消费无效输入
            throw new InputException("请输入正确的成绩");
        }
        double score = sc.nextDouble();
        sc.nextLine(); // 消费换行符
        if (score < 0 || score > 100) throw new InputException("成绩必须在0-100之间");

        if (students.containsKey(id)) throw new InputException("学号已存在");
        students.put(id, new Student(id, name, score));
        System.out.println("添加成功" + students.get(id));
    }

    public void updateScore(String id)throws InputException{
        if (!students.containsKey(id))throw new InputException("学号不存在");
        System.out.print("为ID " + id + "更新成绩: ");
        if(!sc.hasNextDouble()){
            sc.next() ; // 消费无效输入
            throw new InputException("请输入正确的成绩");
        }
        double score = sc.nextDouble();
        sc.nextLine();
        if(score < 0 || score > 100)throw new InputException("成绩必须在0-100之间");
        students.get(id).setScore(score);
        System.out.println("修改成功" + students.get(id));
    }

    public void searchStudent()throws InputException{
        System.out.println("请输入学号：");
        String id = sc.next();
        sc.nextLine();
        if (id.isEmpty())throw new InputException("学号不能为空");

        Student student = students.get(id);
        if (student == null){
            System.out.println("学号：" + id + "不存在");
        }else {
            System.out.println("已找到：" + student);
        }
    }

    public void displayStudents(){
        if (students.isEmpty()){
            System.out.println("没有学生信息");
        }else{
            for (Student student : students.values()){
                System.out.println(student);
            }
        }
    }

    public void close(){
        sc.close();
    }
}
