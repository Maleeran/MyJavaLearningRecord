// Dog.java 示例代码
package src.day08_commandline_oop;

public class Student {
    // 属性（字段）
    String name;
    int age;

    // 方法（行为）
    void study(){
        System.out.println(name + "正在学习！");
    }

    void introduce(){
        System.out.println("大家好，我是" + name + "，今年" + age + "岁");
    }
}
