package src.day06_array_loop;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        // 用户输入数组元素
        System.out.println("请输入5个整数：");
        for(int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }

        int max = nums[0];
        for (int num: nums){
            if(num > max){
                max = num;
            }
        }
        System.out.println("最大值为："+max);

        // 求和与平均值
        int sum = 0;
        for (int num: nums){
            sum += num;
        }
        double mean = sum/(double)nums.length;
        System.out.println("总和为："+ sum);
        System.out.println("平均值为："+ mean);
    }
}
