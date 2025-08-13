package src.day_18_Collections.listDemo.Practice.Homework;

import java.util.*;

class Student {
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(); // 存储所有学生信息
        Set<String> courses = new HashSet<>(); // 存储所有课程名称
        Map<String, List<Student>> courseStudents = new HashMap<>(); // 存储课程名称和对应的学生列表
        Map<String, Map<String, Integer>> courseScores = new HashMap<>();

        // 添加学生信息
        students.add(new Student("张三", 18, "男"));
        students.add(new Student("李四", 19, "女"));
        students.add(new Student("王五", 20, "男"));
        students.add(new Student("赵六", 21, "女"));

        students.forEach(System.out::println);
        System.out.println();

        // 添加课程名称
        String course1 = "Java";
        String course2 = "Python";
        String course3 = "C++";

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        // 添加课程名称和学生列表
        courseStudents.put(course1, students);
        courseStudents.put(course2, students);
        courseStudents.put(course3, students);

        // 为每个学生添加成绩
        courseScores.put(course1, new HashMap<>());
        courseScores.put(course2, new HashMap<>());
        courseScores.put(course3, new HashMap<>());

        courseScores.get(course1).put("张三", 90);
        courseScores.get(course1).put("李四", 85);
        courseScores.get(course1).put("王五", 95);
        courseScores.get(course1).put("赵六", 80);

        courseScores.get(course2).put("张三", 80);
        courseScores.get(course2).put("李四", 90);
        courseScores.get(course2).put("王五", 85);
        courseScores.get(course2).put("赵六", 95);

        courseScores.get(course3).put("张三", 95);
        courseScores.get(course3).put("李四", 85);
        courseScores.get(course3).put("王五", 90);
        courseScores.get(course3).put("赵六", 80);

        System.out.println("所有课程和学生成绩：" + courseScores);

        System.out.println();

        // 查询某课程某学生的成绩
        System.out.println("张三的C++成绩：" + getCourseScore("C++", "张三", courseScores));
    }

    public static Integer getCourseScore(String course, String studentName,
                                         Map<String, Map<String, Integer>> courseScores) {
        if (courseScores.containsKey(course) && courseScores.get(course).containsKey(studentName)) {
            return courseScores.get(course).get(studentName);
        }
        return null;
    }
}
