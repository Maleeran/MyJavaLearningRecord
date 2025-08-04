// CodeBlockDemo.java 示例代码
package src.day11_ClassObjectAdvanced;
public class CodeBlockDemo {
    static {
        System.out.println("静态代码块: 只执行一次");
    }

    {
        System.out.println("普通代码块：每次创建对象都会执行");
    }

    public CodeBlockDemo() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
       CodeBlockDemo Code1 = new CodeBlockDemo();
       CodeBlockDemo Code2 = new CodeBlockDemo();
    }
}