package src.day02_operators;

public class PracticeDay02 {
    public static void main(String[] args) {
        Practice1.run();
        Practice2.run();
        Practice3.run();
    }
}

//写一个表达式判断一个人的身高是否在 160cm ~ 190cm 且年龄在 18~25 之间。
class Practice1{
    public static void run(){
        int isHeight = 180;
        int age = 24;

        System.out.println("身高160cm ~ 190cm且年龄在18~25之间： "+ (isHeight <=190 && isHeight>=160 && age>=18 && age <= 25));
    }
}

//模拟余额转账过程，使用 -= 运算符更新余额
class Practice2{
    public static void run(){
        double money = 5000.0;
        double restmoney;
        restmoney = money -= 450.6; //消费后的余额

        System.out.println("消费后的余额: "+restmoney);
    }
}

// 演示 a += b++ * 2 和 a += ++b * 2 有何不同
class Practice3{
    public static void run(){
        int a = 4;
        int b = 3;

        System.out.println("a += b++ * 2 =" + (a += b++ * 2));

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
//        a = 4;
//        b = 3;

        System.out.println("a += ++b * 2 = " + (a += ++b * 2));
    }
}