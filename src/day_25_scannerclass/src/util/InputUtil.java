package src.day_25_scannerclass.src.util;

import java.util.Scanner;

public class InputUtil {
    public static int getValidInt(Scanner scanner){
        while(true){
            try{
                System.out.println("请输入一个整数：");
                int num = scanner.nextInt();
                scanner.nextLine(); // 消费换行符
                return num;
            }catch (java.util.InputMismatchException e){
                System.out.println("输入错误，请重新输入！");
                scanner.nextLine(); // 消费无效输入
            }
        }
    }
}
