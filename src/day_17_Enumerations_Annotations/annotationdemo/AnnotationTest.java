package src.day_17_Enumerations_Annotations.annotationdemo;

class Parent {
    public void sayHello(){
        System.out.println("Hello from Parent.");
    }
}

class Child extends Parent {
    @Override
    public void sayHello(){
        System.out.println("Hello from Child.");
    }

    @Deprecated // 弃用
    public void oldMethod(){
        System.out.println("This method is deprecated.");
    }
}

public class AnnotationTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.sayHello();
        child.oldMethod(); // 会提示过时警告
    }
}