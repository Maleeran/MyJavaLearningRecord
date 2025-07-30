package src.day05_LoopPracticeAdvanced;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(100)+1;
        int guess = -1;

        System.out.println("我想了一个 1~100 的数字");
        while(guess != secret){
            System.out.println("请输入你的猜测：");
            guess = input.nextInt();
            if(guess > secret){
                System.out.println("太大了！");
            } else if (guess < secret) {
                System.out.println("太小了！");
            }else {
                System.out.println("恭喜你猜对啦！！");
            }
        }
    }
}