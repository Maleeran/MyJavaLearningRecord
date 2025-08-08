package src.day15_Polymorphism.Practice.Practice1;

public class Main {
    public static void main(String[] args) {
        // 向上转型
        Person p = new Student();

        p.sayHello();// 所以这里会输出"Hello from Student."
    }
}
