package src.day12_OverloadandOverride;

public class OverloadDemo {
    /*
    Overload: 同一类中，方法名相同，但参数类型或个数不同
     */
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b ;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        System.out.println(od.add(1, 2));
        System.out.println(od.add(1.0, 2.0));
        System.out.println(od.add(1, 2, 3));
    }
}
