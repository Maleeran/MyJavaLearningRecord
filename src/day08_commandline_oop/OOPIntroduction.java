package src.day08_commandline_oop;

public class OOPIntroduction {
    public static void main(String[] args) {
        // 创建对象
        Student student1 = new Student();

        // 设置对象属性
        student1.name = "小高";
        student1.age = 25;

        // 调用对象的方法
        student1.introduce();
        student1.study();
    }
}
