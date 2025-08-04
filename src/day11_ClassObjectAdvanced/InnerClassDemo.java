package src.day11_ClassObjectAdvanced;

public class InnerClassDemo {
    private String outerName = "Outer";

    class MemberInner{
        void show() {
            System.out.println("非静态内部类访问外部类变量: " + outerName);
        }
    }

    static class StaticInner{
        void show() {
            System.out.println("静态内部类只能访问外部类的静态变量" );
        }
    }

    public static void main(String[] args) {
    InnerClassDemo outer = new InnerClassDemo();
    InnerClassDemo.MemberInner inner = outer.new MemberInner();
    inner.show();

    StaticInner staticInner = new StaticInner();
    staticInner.show();
    }
}

