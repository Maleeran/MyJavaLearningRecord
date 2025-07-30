package src.day04_loops;

public class day_04_practice {
    public static void main(String[] args) {
        Practice1.run();
        Practice2.run();
    }
}

// 使用while计算从m到n的和：
class Practice1{
    public static void run(){
        int sum = 0;
        int m = 20;
        int n = 100;
        while (m <= n){
            sum = sum + m;
            m ++;
        }

        System.out.println("m+··· +n = "+ sum);
    }
}

// 使用do while循环计算从m到n的和。
class Practice2{
    public static void run(){

        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用do while计算 M+...+N
        do {
            sum = sum + m;
            m++;
        } while (m <= 100);
        System.out.println("M+...+N = "+ sum);
    }
}
