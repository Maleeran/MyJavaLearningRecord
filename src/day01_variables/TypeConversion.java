package src.day01_variables;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        double b = a; //自动类型提升
        System.out.println("自动类型转换 int → double：" + b);

        double c = 9.5;
        int d = (int)c;
        System.out.println("强制类型转换 double → int：" + d);

        //获取类型最大/最小值
        System.out.println("int最大值：" + Integer.MAX_VALUE);
        System.out.println("int最小值：" + Integer.MIN_VALUE);
        System.out.println("double最大值：" + Double.MAX_VALUE);
        System.out.println("double最小值：" + Double.MIN_VALUE);
    }
}
