package src.day01_variables;

public class VariableSwap {
    public static void main(String[] args) {
     System.out.println("使用中间变量的交换方法：");
     int x = 5;
     int y = 10;

     System.out.println("交换前：x = "+ x + "，y = "+ y);

     // 使用中间变量
     int z = x;
     x = y;
     y = z;
     System.out.println("交换后：x = "+ x + "，y = "+ y);
     // 重置变量
     x = 5;
     y = 10;

     // 创建第二个类的实例来演示不使用中间变量的交换
     NoTempSwap swapper = new NoTempSwap();
     swapper.swapWithoutTemp(x, y);
    }
}
class NoTempSwap{
    public  void swapWithoutTemp(int x,int y) {
        System.out.println("不使用中间变量的交换方法：");

        // 方法1 - 算术运算
        System.out.println("方法1 - 算术运算：");
        System.out.println("交换前：x = " + x + "，y = " + y);
        x = x + y;  // x = 5 + 10 = 15
        y = x - y;  // y = 15 - 10 = 5
        x = x - y;  // x = 15 - 5 = 10
        System.out.println("交换后：x = " + x + "，y = " + y);
    }
}
