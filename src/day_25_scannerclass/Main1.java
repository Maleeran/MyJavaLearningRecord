package src.day_25_scannerclass;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("请输入您的名字：");
        String name = sc1.nextLine();

        System.out.println("请输入您的年龄：");
        int age = sc1.nextInt();
        sc1.nextLine();

        System.out.print("姓名："+ name + "，年龄：" + age);
        sc1.close();
    }
}
