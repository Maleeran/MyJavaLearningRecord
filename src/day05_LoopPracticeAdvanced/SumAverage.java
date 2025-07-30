package src.day05_LoopPracticeAdvanced;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0,count = 0;
        int num;

        System.out.println("请输入一系列正整数，输入 -1 结束：");

        while (true){
            num = input.nextInt();
            if (num == -1) break;
            sum += num;
            count++;
        }

        if (count == 0){
            System.out.println("你没有输入任何数据。。");
        }else{
            System.out.println("总和：" + sum);
            System.out.println("平均值：" + (sum * 1.0 / count));
        }
    }
}
