package src.day04_loops;

public class Loop_03_For {
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25 };
        int sum = 0;
        for (int i=0;i<ns.length;i++){
            System.out.println("i = "+ i + "ns[i]" + ns[i]);
            sum = sum + ns[i];
        }
        System.out.println("sum = " + sum);
    }
}

//for each循环，它可以更简单地遍历数组
class For_each{
    public static void main(String[] args) {
        int[]ns ={1, 1, 2, 3, 5, 8 };
        for (int n : ns){
            System.out.println(n);
        }
    }
}


class For_MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1;i <= 9; i++){
            for (int j = 1;j <= i; j++){
                System.out.println(j + "×" + i + "=" + (i*j) + "\t"); // "\t" 为水平制表符
            }
            System.out.println();
        }
    }
}