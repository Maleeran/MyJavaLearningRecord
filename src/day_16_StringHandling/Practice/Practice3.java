package src.day_16_StringHandling.Practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String student = scanner.nextLine();

        System.out.println("请输入学生成绩：");
        double score = scanner.nextDouble();

        String result = String.format("学生 %s 的考试成绩是：%.2f", student, score);
        System.out.println(result);
    }
}
