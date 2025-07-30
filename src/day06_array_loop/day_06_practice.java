package src.day06_array_loop;

public class day_06_practice {
    public static void main(String[] args) {
        Practice1.run();
        Practice2.run();
        Practice3.run();
    }
}
class Practice1{
    public static void run() {
        int[] nums = {15, 29, 3, 47, 9};

        // 初始化最大值与最小值
        int max = nums[0];
        int min = nums[0];

        for (int num: nums){
            System.out.print(num+" ");
            if (num > max){
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("\n最大值为："+ max);
        System.out.println("最小值为："+ min);
    }
}
class Practice2{
    public static void run() {
        double[] scores = {88.5, 76.0, 90.5, 69.0, 92.0};

        int sum = 0;

        for (double score: scores){
            System.out.print(score + " ");
            sum += score;
        }
        System.out.println("\n总和为："+ sum);
        System.out.println("平均值为："+ sum / scores.length);
    }
}

class Practice3{
    public static void run(){
        int[] a = {1, 2, 3, 4, 5};

        for(int i = 0; i < a.length; i++){
            a[i] = 6 - a[i];
        }
        for(int ai: a){
            System.out.print(ai+" ");
        }
    }
}