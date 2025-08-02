// Person.java 示例代码
package src.day09_constructor_keywords;

public class Person {
    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person 构造方法被调用了！");
    }

    public void sayHello(){
        System.out.println("你好，我是"+ name + "，今年 " + age +" 岁。");
    }
}
