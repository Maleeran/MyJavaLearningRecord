// Loop_02_DoWhile.java 示例代码
package src.day04_loops;

import java.util.Scanner;

public class Loop_02_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input ;

        do{
            System.out.print("请输入密码（hint：Gao）：");
            input = scanner.nextLine();
            if (!input.equals("Gao200182")){
                System.out.println("❌ 错误！密码不正确，请重新输入。");
            }
        } while (!input.equals("Gao200182"));

        System.out.println("✅ 正确！密码正确，欢迎进入系统！");
    }
}

