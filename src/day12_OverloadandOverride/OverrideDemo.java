package src.day12_OverloadandOverride;

class Parent {
    public void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Hello from Child");
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet();

    }
}
