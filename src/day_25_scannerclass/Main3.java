package src.day_25_scannerclass;

import src.day_25_scannerclass.src.util.InputUtil;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        int num = InputUtil.getValidInt(sc3);
        System.out.println("输入的整数是：" + num);
        sc3.close();
    }

}
