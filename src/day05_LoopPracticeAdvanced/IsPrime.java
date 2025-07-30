package src.day05_LoopPracticeAdvanced;

import java.util.Scanner;

//是不是素数你说了算
public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个整数看看是不是素数：");
        int n = input.nextInt();
        boolean isPrime = true;

        if (n <= 1)isPrime = false;
        else {
            for(int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? n +" 是素数": n + " 不是素数");
    }
}
