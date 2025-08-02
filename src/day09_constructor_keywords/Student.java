// Student.java 示例代码
package src.day09_constructor_keywords;

public class Student extends Person {
    String school;

    public Student(String name, int age, String school){
        super(name, age);
        this.school = school;
        System.out.println("Student 构造方法被调用了！");
    }

    public void showInfo(){
        sayHello();
        System.out.println("我来自："+ school);
    }
}