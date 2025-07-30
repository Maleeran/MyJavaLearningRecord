package src.day03_controlflow;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int a = 10, b = 20;

        int max = (a > b) ? a : b;
        System.out.println("较大值为: " + max);

        int min = (a < b) ? a : b;
        System.out.println("较小值为: " + min);

        String ifequ = (a == b) ? "相等" : "不相等";

        System.out.println(ifequ);

    }
}
