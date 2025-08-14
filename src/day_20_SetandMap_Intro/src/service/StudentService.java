package src.day_20_SetandMap_Intro.src.service;

import src.day_20_SetandMap_Intro.src.model.Student;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentService {
    private final Set<Student> studentSet = new HashSet<>(); // 存储学生，去重
    private final Map<String, Student> studentMap = new HashMap<>(); // 学号到学生的映射


    // 添加学生
    public boolean addStudent(Student student) {
        if(studentSet.add(student)){
            studentMap.put(student.getId(), student);
            return true;
        }
        return false;// 已存在相同学号的学生
    }
    // 查询学生
    public Student getStudentById(String id) {
        return studentMap.get(id);
    }
    // 修改成绩
    public boolean updateScore(String id, double newScore) {
        Student student = studentMap.get(id);
        if (student != null) {
            student.setScore(newScore);
            return true;
        }
        return false;
    }
    // 删除学生
    public boolean deleteStudent(String id) {
        Student student = studentMap.remove(id);
        if (student != null){
            studentSet.remove(student);
            return true;
        }
        return false;
    }

    // 遍历所有学生
    public void displayAllStudents() {
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }

    // 遍历Map的键值对(使用entrySet)
    public void displayAllStudentsMap() {
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("ID:" + entry.getKey() + ", Student: " + entry.getValue());
        }
    }

    /**
     * 统计成绩高于阈值的学生数量
     * @param threshold 成绩阈值
     * @ return count 记录高于阈值的学生数量
     */
    public int countStudentsAboveScore(double threshold) {
        int count = 0;
        // 使用 for-each 遍历 Set
        for (Student student : studentSet) {
            if (student.getScore() > threshold) {
                count++;
            }
        }
        return count;
    }
}

