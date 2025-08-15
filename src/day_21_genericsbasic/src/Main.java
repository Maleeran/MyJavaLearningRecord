package src.day_21_genericsbasic.src;

import src.day_21_genericsbasic.src.model.Student;
import src.day_21_genericsbasic.src.model.Course;
import src.day_21_genericsbasic.src.util.GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 创建一个List集合，存放 Student 和 Course 对象
        GenericBox<Student> studentBox = new GenericBox<>();
        GenericBox<Course> courseBox = new GenericBox<>();

        // 添加学生和课程对象
        studentBox.add(new Student("001", "小王", 90));
        studentBox.add(new Student("002", "小李", 85));
        courseBox.add(new Course("c101", "Java课程"));
        courseBox.add(new Course("c102", "C++课程"));

        // 使用泛型方法
        System.out.println("Students: ");
        GenericBox.printlist(studentBox.getAll());

        System.out.println("\nCourses: ");
        GenericBox.printlist(courseBox.getAll());

        // 使用通配符？extends Number
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("\nNumbers (extends Number): " );
        GenericBox.printNumber(numbers);

        // 使用通配符？super Integer
        List<Number> numberList = new ArrayList<>();
        GenericBox.addAll(numberList, 40); // 添加Integer到Number列表
        System.out.println("\nNumbers (super Integer): ");
        GenericBox.printlist(numberList);
    }
}
