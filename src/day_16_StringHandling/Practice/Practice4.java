package src.day_16_StringHandling.Practice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String input = sc.nextLine();

        // 使用StringBuilder类
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());

        sc.close();
    }
}
