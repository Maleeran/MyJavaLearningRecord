package src.day13_Inheritance_ObjectClass;

import java.util.Objects;

public class Student extends Person {
    private String  studentId;

    public Student (String name,int age, String studentId){
        super(name, age);
        this.studentId = studentId;
    }

    public void study(){
        System.out.println(name + " is studying. ID: " + studentId);
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("And I am a student.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, studentId);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", studentId='" + studentId + "'}";
    }
}
