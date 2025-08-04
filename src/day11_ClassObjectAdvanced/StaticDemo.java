// StaticDemo.java 示例代码
package src.day11_ClassObjectAdvanced;

public class StaticDemo {
    public static int staticCount = 0;
    public int instanceCount = 0;

    public StaticDemo() {
        staticCount++;
        instanceCount++;
    }

    public static void showStatic() {
        System.out.println("静态方法被调用，staticCount = " + staticCount);
//      System.out.println(instanceCount); 错误，实例不能在静态方法中调用
    }

    public void showInstance() {
        System.out.println("实例方法被调用，instanceCount = " + instanceCount);
        System.out.println(staticCount);
    }

    public static void main(String[] args) {
        StaticDemo a = new StaticDemo();
        StaticDemo b = new StaticDemo();
        a.showInstance();
        b.showInstance();
        StaticDemo.showStatic(); // 推荐通过类名调用
    }
}