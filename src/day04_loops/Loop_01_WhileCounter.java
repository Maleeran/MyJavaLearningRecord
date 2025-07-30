// Loop_01_WhileCounter.java 示例代码
package src.day04_loops;

public class Loop_01_WhileCounter {
    public static void main(String[] args) {
        int km = 1;
        while (km <= 5) {
            System.out.println("🏃‍♂️ 跑了 " + km + " 公里，刚开始继续加油！");
            km++;
        }
        while (km > 5 && km <= 10){
            System.out.println("🏃‍♂️ 跑了 " + km + " 公里，累了但还得继续！");
            km++;
        }
        System.out.println("🎉 成功完成今日打卡，洗澡去！");
    }
}

class WhileMain{
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while (n <= 100){
            sum = sum + n;
            n++;
        }
        System.out.println("连续求和1—100：" + sum);
    }
}

// 典型错误例子
class Mistake {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        while (n <= 100) {
            n ++; // 先++，导致多加了101
            sum = sum + n;
        }
        System.out.println(sum);
    }
}