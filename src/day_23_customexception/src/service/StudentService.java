package src.day_23_customexception.src.service;

import src.day_23_customexception.src.model.Student;
import src.day_23_customexception.src.exception.DuplicateIDException;
import src.day_23_customexception.src.exception.InvalidScoreException;
import src.day_23_customexception.src.exception.StudentNotFoundException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentService {
    private Set<Student> studentSet = new HashSet<>();
    private Map<String, Student> studentMap = new HashMap<>();

    // 添加学生，抛出自定义异常
    public void addStudent(Student student)throws DuplicateIDException, InvalidScoreException{
        // 检查成绩有效性
        if(student.getScore()<0 || student.getScore()>100){
            throw new InvalidScoreException("分数：" + student.getScore() + "必须在0~100之间");
        }

        // 检查学号重复
        for(Student existingStudent : studentSet){
            if (existingStudent.getId().equals(student.getId())){
                throw new DuplicateIDException("学号：" + student.getId()+"已经存在咯~");
            }
        }
        // 添加学生
        studentSet.add(student);
        studentMap.put(student.getId(), student);
    }

    public void removeStudent(String id)throws StudentNotFoundException{
        Student student = studentMap.remove(id);
        if(student == null){
            throw new StudentNotFoundException("学号：" + id + "不存在");
        }
        studentSet.remove(student);
    }

    // 显示所有学生
    public void displayAllStudents(){
        for(Student student : studentSet){
            System.out.println(student);
        }
    }
}


